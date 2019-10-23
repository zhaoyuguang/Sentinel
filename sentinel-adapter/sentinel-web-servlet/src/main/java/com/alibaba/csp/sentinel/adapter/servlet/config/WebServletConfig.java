/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.adapter.servlet.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import com.alibaba.csp.sentinel.adapter.servlet.CommonTotalFilter;
import com.alibaba.csp.sentinel.config.SentinelConfig;

/**
 * @author leyou
 */
public class WebServletConfig {

    public static final String WEB_SERVLET_CONTEXT_NAME = "sentinel_web_servlet_context";

    public static final String BLOCK_PAGE = "csp.sentinel.web.servlet.block.page";

    public static final String BLOCK_PAGE_HTTP_STATUS = "csp.sentinel.web.servlet.block.page.http.status";

    /**
     * Get redirecting page when Sentinel blocking for {@link CommonFilter} or
     * {@link CommonTotalFilter} occurs.
     *
     * @return the block page URL, maybe null if not configured.
     */
    public static String getBlockPage() {
        return SentinelConfig.getConfig(BLOCK_PAGE);
    }

    public static void setBlockPage(String blockPage) {
        SentinelConfig.setConfig(BLOCK_PAGE, blockPage);
    }

    /**
     * Return status 429 in the default block page,
     * you can use -Dcsp.sentinel.web.servlet.block.page.http.status=200 or other http status,
     * to set http status which you want of the default block page.
     *
     * @return http status
     */
    public static int getBlockPageHttpStatus() {
        return Integer.parseInt(SentinelConfig.getConfig(BLOCK_PAGE_HTTP_STATUS));
    }

    public static void setBlockPageHttpStatus(int httpStatus) {
        SentinelConfig.setConfig(BLOCK_PAGE_HTTP_STATUS, String.valueOf(httpStatus));
    }
}
