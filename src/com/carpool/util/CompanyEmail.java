package com.carpool.util;

import java.util.Map;

import com.google.common.collect.Maps;

/*
 * TODO: Replace this hard-coded map by DB table
 */
public class CompanyEmail {
    private static final Map<String, String> companyToEmail;
    static {
        companyToEmail = Maps.newHashMap();
        companyToEmail.put("AMAZON", "amazon.com");
        companyToEmail.put("Microsoft", "microsoft.com");
    }
}
