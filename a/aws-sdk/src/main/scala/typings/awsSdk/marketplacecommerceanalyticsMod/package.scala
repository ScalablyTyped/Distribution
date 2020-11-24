package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object marketplacecommerceanalyticsMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.marketplacecommerceanalyticsMod.ClientApiVersions
  
  type CustomerDefinedValues = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.marketplacecommerceanalyticsMod.OptionalValue]
  
  type DataSetPublicationDate = typings.std.Date
  
  type DataSetRequestId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.customer_subscriber_hourly_monthly_subscriptions
    - typings.awsSdk.awsSdkStrings.customer_subscriber_annual_subscriptions
    - typings.awsSdk.awsSdkStrings.daily_business_usage_by_instance_type
    - typings.awsSdk.awsSdkStrings.daily_business_fees
    - typings.awsSdk.awsSdkStrings.daily_business_free_trial_conversions
    - typings.awsSdk.awsSdkStrings.daily_business_new_instances
    - typings.awsSdk.awsSdkStrings.daily_business_new_product_subscribers
    - typings.awsSdk.awsSdkStrings.daily_business_canceled_product_subscribers
    - typings.awsSdk.awsSdkStrings.monthly_revenue_billing_and_revenue_data
    - typings.awsSdk.awsSdkStrings.monthly_revenue_annual_subscriptions
    - typings.awsSdk.awsSdkStrings.monthly_revenue_field_demonstration_usage
    - typings.awsSdk.awsSdkStrings.monthly_revenue_flexible_payment_schedule
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_product
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_product_with_uncollected_funds
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_instance_hours
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_customer_geo
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_age_of_uncollected_funds
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_age_of_disbursed_funds
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_age_of_past_due_funds
    - typings.awsSdk.awsSdkStrings.disbursed_amount_by_uncollected_funds_breakdown
    - typings.awsSdk.awsSdkStrings.customer_profile_by_industry
    - typings.awsSdk.awsSdkStrings.customer_profile_by_revenue
    - typings.awsSdk.awsSdkStrings.customer_profile_by_geography
    - typings.awsSdk.awsSdkStrings.sales_compensation_billed_revenue
    - typings.awsSdk.awsSdkStrings.us_sales_and_use_tax_records
    - java.lang.String
  */
  type DataSetType = typings.awsSdk.marketplacecommerceanalyticsMod._DataSetType | java.lang.String
  
  type DestinationS3BucketName = java.lang.String
  
  type DestinationS3Prefix = java.lang.String
  
  type FromDate = typings.std.Date
  
  type OptionalKey = java.lang.String
  
  type OptionalValue = java.lang.String
  
  type RoleNameArn = java.lang.String
  
  type SnsTopicArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.customer_support_contacts_data
    - typings.awsSdk.awsSdkStrings.test_customer_support_contacts_data
    - java.lang.String
  */
  type SupportDataSetType = typings.awsSdk.marketplacecommerceanalyticsMod._SupportDataSetType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-07-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.marketplacecommerceanalyticsMod._apiVersion | java.lang.String
}
