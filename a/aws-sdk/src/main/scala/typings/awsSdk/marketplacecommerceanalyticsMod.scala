package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketplacecommerceanalyticsMod {
  
  @JSImport("aws-sdk/clients/marketplacecommerceanalytics", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends MarketplaceCommerceAnalytics {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.marketplacecommerceanalyticsMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type CustomerDefinedValues = StringDictionary[OptionalValue]
  
  type DataSetPublicationDate = Date
  
  type DataSetRequestId = String
  
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
  type DataSetType = _DataSetType | String
  
  type DestinationS3BucketName = String
  
  type DestinationS3Prefix = String
  
  type FromDate = Date
  
  @js.native
  trait GenerateDataSetRequest extends StObject {
    
    /**
      * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the data set metadata file. These key-value pairs can be used to correlated responses with tracking information from other systems.
      */
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.native
    
    /**
      * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired day. For monthly data sets except those with prefix disbursed_amount, provide a date with month-level granularity for the desired month (the day value will be ignored). For data sets with prefix disbursed_amount, provide a date with day-level granularity for the desired day. For these data sets we will look backwards in time over the range of 31 days until the first data set is found (the latest one).
      */
    var dataSetPublicationDate: DataSetPublicationDate = js.native
    
    /**
      * The desired data set type.    customer_subscriber_hourly_monthly_subscriptions From 2017-09-15 to present: Available daily by 24:00 UTC.   customer_subscriber_annual_subscriptions From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_usage_by_instance_type From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_fees From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_free_trial_conversions From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_new_instances From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_new_product_subscribers From 2017-09-15 to present: Available daily by 24:00 UTC.   daily_business_canceled_product_subscribers From 2017-09-15 to present: Available daily by 24:00 UTC.   monthly_revenue_billing_and_revenue_data From 2017-09-15 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from one month prior.   monthly_revenue_annual_subscriptions From 2017-09-15 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes up-front software charges (e.g. annual) from one month prior.   monthly_revenue_field_demonstration_usage From 2018-03-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   monthly_revenue_flexible_payment_schedule From 2018-11-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   disbursed_amount_by_product From 2017-09-15 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_instance_hours From 2017-09-15 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_customer_geo From 2017-09-15 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_uncollected_funds From 2017-09-15 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_disbursed_funds From 2017-09-15 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_past_due_funds From 2018-04-07 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_uncollected_funds_breakdown From 2019-10-04 to present: Available every 30 days by 24:00 UTC.   sales_compensation_billed_revenue From 2017-09-15 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one month prior.   us_sales_and_use_tax_records From 2017-09-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   disbursed_amount_by_product_with_uncollected_funds This data set is deprecated. Download related reports from AMMP instead!   customer_profile_by_industry This data set is deprecated. Download related reports from AMMP instead!   customer_profile_by_revenue This data set is deprecated. Download related reports from AMMP instead!   customer_profile_by_geography This data set is deprecated. Download related reports from AMMP instead!   
      */
    var dataSetType: DataSetType = js.native
    
    /**
      * The name (friendly name, not ARN) of the destination S3 bucket.
      */
    var destinationS3BucketName: DestinationS3BucketName = js.native
    
    /**
      * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3 bucket root.
      */
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS services.
      */
    var roleNameArn: RoleNameArn = js.native
    
    /**
      * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an error has occurred.
      */
    var snsTopicArn: SnsTopicArn = js.native
  }
  object GenerateDataSetRequest {
    
    @scala.inline
    def apply(
      dataSetPublicationDate: DataSetPublicationDate,
      dataSetType: DataSetType,
      destinationS3BucketName: DestinationS3BucketName,
      roleNameArn: RoleNameArn,
      snsTopicArn: SnsTopicArn
    ): GenerateDataSetRequest = {
      val __obj = js.Dynamic.literal(dataSetPublicationDate = dataSetPublicationDate.asInstanceOf[js.Any], dataSetType = dataSetType.asInstanceOf[js.Any], destinationS3BucketName = destinationS3BucketName.asInstanceOf[js.Any], roleNameArn = roleNameArn.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataSetRequest]
    }
    
    @scala.inline
    implicit class GenerateDataSetRequestMutableBuilder[Self <: GenerateDataSetRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomerDefinedValues(value: CustomerDefinedValues): Self = StObject.set(x, "customerDefinedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerDefinedValuesUndefined: Self = StObject.set(x, "customerDefinedValues", js.undefined)
      
      @scala.inline
      def setDataSetPublicationDate(value: DataSetPublicationDate): Self = StObject.set(x, "dataSetPublicationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSetType(value: DataSetType): Self = StObject.set(x, "dataSetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3BucketName(value: DestinationS3BucketName): Self = StObject.set(x, "destinationS3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3Prefix(value: DestinationS3Prefix): Self = StObject.set(x, "destinationS3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3PrefixUndefined: Self = StObject.set(x, "destinationS3Prefix", js.undefined)
      
      @scala.inline
      def setRoleNameArn(value: RoleNameArn): Self = StObject.set(x, "roleNameArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenerateDataSetResult extends StObject {
    
    /**
      * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used to correlate a request with notifications from the SNS topic.
      */
    var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.native
  }
  object GenerateDataSetResult {
    
    @scala.inline
    def apply(): GenerateDataSetResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateDataSetResult]
    }
    
    @scala.inline
    implicit class GenerateDataSetResultMutableBuilder[Self <: GenerateDataSetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSetRequestId(value: DataSetRequestId): Self = StObject.set(x, "dataSetRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSetRequestIdUndefined: Self = StObject.set(x, "dataSetRequestId", js.undefined)
    }
  }
  
  @js.native
  trait MarketplaceCommerceAnalytics extends Service {
    
    @JSName("config")
    var config_MarketplaceCommerceAnalytics: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Given a data set type and data set publication date, asynchronously publishes the requested data set to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
      */
    def generateDataSet(): Request[GenerateDataSetResult, AWSError] = js.native
    def generateDataSet(callback: js.Function2[/* err */ AWSError, /* data */ GenerateDataSetResult, Unit]): Request[GenerateDataSetResult, AWSError] = js.native
    /**
      * Given a data set type and data set publication date, asynchronously publishes the requested data set to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
      */
    def generateDataSet(params: GenerateDataSetRequest): Request[GenerateDataSetResult, AWSError] = js.native
    def generateDataSet(
      params: GenerateDataSetRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GenerateDataSetResult, Unit]
    ): Request[GenerateDataSetResult, AWSError] = js.native
    
    /**
      * Given a data set type and a from date, asynchronously publishes the requested customer support data to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
      */
    def startSupportDataExport(): Request[StartSupportDataExportResult, AWSError] = js.native
    def startSupportDataExport(callback: js.Function2[/* err */ AWSError, /* data */ StartSupportDataExportResult, Unit]): Request[StartSupportDataExportResult, AWSError] = js.native
    /**
      * Given a data set type and a from date, asynchronously publishes the requested customer support data to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
      */
    def startSupportDataExport(params: StartSupportDataExportRequest): Request[StartSupportDataExportResult, AWSError] = js.native
    def startSupportDataExport(
      params: StartSupportDataExportRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ StartSupportDataExportResult, Unit]
    ): Request[StartSupportDataExportResult, AWSError] = js.native
  }
  
  type OptionalKey = String
  
  type OptionalValue = String
  
  type RoleNameArn = String
  
  type SnsTopicArn = String
  
  @js.native
  trait StartSupportDataExportRequest extends StObject {
    
    /**
      * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the data set metadata file.
      */
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.native
    
    /**
      *  Specifies the data set type to be written to the output csv file. The data set types customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code, Operation Type, and Operation Time.    customer_support_contacts_data Customer support contact data. The data set will contain all changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date parameter. test_customer_support_contacts_data An example data set containing static test data in the same format as customer_support_contacts_data  
      */
    var dataSetType: SupportDataSetType = js.native
    
    /**
      * The name (friendly name, not ARN) of the destination S3 bucket.
      */
    var destinationS3BucketName: DestinationS3BucketName = js.native
    
    /**
      * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3 bucket root.
      */
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.native
    
    /**
      * The start date from which to retrieve the data set in UTC. This parameter only affects the customer_support_contacts_data data set type.
      */
    var fromDate: FromDate = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS services.
      */
    var roleNameArn: RoleNameArn = js.native
    
    /**
      * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an error has occurred.
      */
    var snsTopicArn: SnsTopicArn = js.native
  }
  object StartSupportDataExportRequest {
    
    @scala.inline
    def apply(
      dataSetType: SupportDataSetType,
      destinationS3BucketName: DestinationS3BucketName,
      fromDate: FromDate,
      roleNameArn: RoleNameArn,
      snsTopicArn: SnsTopicArn
    ): StartSupportDataExportRequest = {
      val __obj = js.Dynamic.literal(dataSetType = dataSetType.asInstanceOf[js.Any], destinationS3BucketName = destinationS3BucketName.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], roleNameArn = roleNameArn.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartSupportDataExportRequest]
    }
    
    @scala.inline
    implicit class StartSupportDataExportRequestMutableBuilder[Self <: StartSupportDataExportRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomerDefinedValues(value: CustomerDefinedValues): Self = StObject.set(x, "customerDefinedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerDefinedValuesUndefined: Self = StObject.set(x, "customerDefinedValues", js.undefined)
      
      @scala.inline
      def setDataSetType(value: SupportDataSetType): Self = StObject.set(x, "dataSetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3BucketName(value: DestinationS3BucketName): Self = StObject.set(x, "destinationS3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3Prefix(value: DestinationS3Prefix): Self = StObject.set(x, "destinationS3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationS3PrefixUndefined: Self = StObject.set(x, "destinationS3Prefix", js.undefined)
      
      @scala.inline
      def setFromDate(value: FromDate): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNameArn(value: RoleNameArn): Self = StObject.set(x, "roleNameArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartSupportDataExportResult extends StObject {
    
    /**
      * A unique identifier representing a specific request to the StartSupportDataExport operation. This identifier can be used to correlate a request with notifications from the SNS topic.
      */
    var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.native
  }
  object StartSupportDataExportResult {
    
    @scala.inline
    def apply(): StartSupportDataExportResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartSupportDataExportResult]
    }
    
    @scala.inline
    implicit class StartSupportDataExportResultMutableBuilder[Self <: StartSupportDataExportResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSetRequestId(value: DataSetRequestId): Self = StObject.set(x, "dataSetRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSetRequestIdUndefined: Self = StObject.set(x, "dataSetRequestId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.customer_support_contacts_data
    - typings.awsSdk.awsSdkStrings.test_customer_support_contacts_data
    - java.lang.String
  */
  type SupportDataSetType = _SupportDataSetType | String
  
  trait _DataSetType extends StObject
  
  trait _SupportDataSetType extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-07-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
