package typings.awsSdk

import typings.awsSdk.awsSdkStrings.TERM_MATCH
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricingMod {
  
  @JSImport("aws-sdk/clients/pricing", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends Pricing {
    def this(options: ClientConfiguration) = this()
  }
  
  type AttributeNameList = js.Array[String]
  
  @js.native
  trait AttributeValue extends StObject {
    
    /**
      * The specific value of an attributeName.
      */
    var Value: js.UndefOr[String] = js.native
  }
  object AttributeValue {
    
    @scala.inline
    def apply(): AttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValue]
    }
    
    @scala.inline
    implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type AttributeValueList = js.Array[AttributeValue]
  
  @js.native
  trait Blob extends StObject
  
  type BoxedInteger = Double
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.pricingMod.apiVersion] = js.native
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
  
  @js.native
  trait DescribeServicesRequest extends StObject {
    
    /**
      * The format version that you want the response to be in. Valid values are: aws_v1 
      */
    var FormatVersion: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of results that you want returned in the response.
      */
    var MaxResults: js.UndefOr[BoxedInteger] = js.native
    
    /**
      * The pagination token that indicates the next set of results that you want to retrieve.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
      */
    var ServiceCode: js.UndefOr[String] = js.native
  }
  object DescribeServicesRequest {
    
    @scala.inline
    def apply(): DescribeServicesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeServicesRequest]
    }
    
    @scala.inline
    implicit class DescribeServicesRequestMutableBuilder[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
      
      @scala.inline
      def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    }
  }
  
  @js.native
  trait DescribeServicesResponse extends StObject {
    
    /**
      * The format version of the response. For example, aws_v1.
      */
    var FormatVersion: js.UndefOr[String] = js.native
    
    /**
      * The pagination token for the next set of retreivable results.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The service metadata for the service or services in the response.
      */
    var Services: js.UndefOr[ServiceList] = js.native
  }
  object DescribeServicesResponse {
    
    @scala.inline
    def apply(): DescribeServicesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeServicesResponse]
    }
    
    @scala.inline
    implicit class DescribeServicesResponseMutableBuilder[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServices(value: ServiceList): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
      
      @scala.inline
      def setServicesVarargs(value: Service*): Self = StObject.set(x, "Services", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    /**
      * The product metadata field that you want to filter on. You can filter by just the service code to see all products for a specific service, filter by just the attribute name to see a specific attribute for multiple services, or use both a service code and an attribute name to retrieve only products that match both fields. Valid values include: ServiceCode, and all attribute names For example, you can filter by the AmazonEC2 service code and the volumeType attribute name to get the prices for only Amazon EC2 volumes.
      */
    var Field: String = js.native
    
    /**
      * The type of filter that you want to use. Valid values are: TERM_MATCH. TERM_MATCH returns only products that match both the given filter field and the given value.
      */
    var Type: FilterType = js.native
    
    /**
      * The service code or attribute value that you want to filter by. If you are filtering by service code this is the actual service code, such as AmazonEC2. If you are filtering by attribute name, this is the attribute value that you want the returned products to match, such as a Provisioned IOPS volume.
      */
    var Value: String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(Field: String, Type: FilterType, Value: String): Filter = {
      val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: FilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterType = TERM_MATCH | java.lang.String
  
  type Filters = js.Array[Filter]
  
  @js.native
  trait GetAttributeValuesRequest extends StObject {
    
    /**
      * The name of the attribute that you want to retrieve the values for, such as volumeType.
      */
    var AttributeName: String = js.native
    
    /**
      * The maximum number of results to return in response.
      */
    var MaxResults: js.UndefOr[BoxedInteger] = js.native
    
    /**
      * The pagination token that indicates the next set of results that you want to retrieve.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
      */
    var ServiceCode: String = js.native
  }
  object GetAttributeValuesRequest {
    
    @scala.inline
    def apply(AttributeName: String, ServiceCode: String): GetAttributeValuesRequest = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAttributeValuesRequest]
    }
    
    @scala.inline
    implicit class GetAttributeValuesRequestMutableBuilder[Self <: GetAttributeValuesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAttributeValuesResponse extends StObject {
    
    /**
      * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
      */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.native
    
    /**
      * The pagination token that indicates the next set of results to retrieve.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object GetAttributeValuesResponse {
    
    @scala.inline
    def apply(): GetAttributeValuesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAttributeValuesResponse]
    }
    
    @scala.inline
    implicit class GetAttributeValuesResponseMutableBuilder[Self <: GetAttributeValuesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeValues(value: AttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
      
      @scala.inline
      def setAttributeValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValues", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait GetProductsRequest extends StObject {
    
    /**
      * The list of filters that limit the returned products. only products that match all filters are returned.
      */
    var Filters: js.UndefOr[typings.awsSdk.pricingMod.Filters] = js.native
    
    /**
      * The format version that you want the response to be in. Valid values are: aws_v1 
      */
    var FormatVersion: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of results to return in the response.
      */
    var MaxResults: js.UndefOr[BoxedInteger] = js.native
    
    /**
      * The pagination token that indicates the next set of results that you want to retrieve.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The code for the service whose products you want to retrieve. 
      */
    var ServiceCode: js.UndefOr[String] = js.native
  }
  object GetProductsRequest {
    
    @scala.inline
    def apply(): GetProductsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetProductsRequest]
    }
    
    @scala.inline
    implicit class GetProductsRequestMutableBuilder[Self <: GetProductsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
      
      @scala.inline
      def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
      
      @scala.inline
      def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    }
  }
  
  @js.native
  trait GetProductsResponse extends StObject {
    
    /**
      * The format version of the response. For example, aws_v1.
      */
    var FormatVersion: js.UndefOr[String] = js.native
    
    /**
      * The pagination token that indicates the next set of results to retrieve.
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * The list of products that match your filters. The list contains both the product metadata and the price information.
      */
    var PriceList: js.UndefOr[typings.awsSdk.pricingMod.PriceList] = js.native
  }
  object GetProductsResponse {
    
    @scala.inline
    def apply(): GetProductsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetProductsResponse]
    }
    
    @scala.inline
    implicit class GetProductsResponseMutableBuilder[Self <: GetProductsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setPriceList(value: PriceList): Self = StObject.set(x, "PriceList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceListUndefined: Self = StObject.set(x, "PriceList", js.undefined)
      
      @scala.inline
      def setPriceListVarargs(value: PriceListItemJSON*): Self = StObject.set(x, "PriceList", js.Array(value :_*))
    }
  }
  
  type PriceList = js.Array[PriceListItemJSON]
  
  type PriceListItemJSON = java.lang.String
  
  @js.native
  trait Pricing extends Service {
    
    var config: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
      */
    def describeServices(): Request[DescribeServicesResponse, AWSError] = js.native
    def describeServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]): Request[DescribeServicesResponse, AWSError] = js.native
    /**
      * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
      */
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse, AWSError] = js.native
    def describeServices(
      params: DescribeServicesRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
    ): Request[DescribeServicesResponse, AWSError] = js.native
    
    /**
      * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
      */
    def getAttributeValues(): Request[GetAttributeValuesResponse, AWSError] = js.native
    def getAttributeValues(callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]): Request[GetAttributeValuesResponse, AWSError] = js.native
    /**
      * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
      */
    def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse, AWSError] = js.native
    def getAttributeValues(
      params: GetAttributeValuesRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]
    ): Request[GetAttributeValuesResponse, AWSError] = js.native
    
    /**
      * Returns a list of all products that match the filter criteria.
      */
    def getProducts(): Request[GetProductsResponse, AWSError] = js.native
    def getProducts(callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]): Request[GetProductsResponse, AWSError] = js.native
    /**
      * Returns a list of all products that match the filter criteria.
      */
    def getProducts(params: GetProductsRequest): Request[GetProductsResponse, AWSError] = js.native
    def getProducts(
      params: GetProductsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]
    ): Request[GetProductsResponse, AWSError] = js.native
  }
  
  @js.native
  trait Service extends StObject {
    
    /**
      * The attributes that are available for this service.
      */
    var AttributeNames: js.UndefOr[AttributeNameList] = js.native
    
    /**
      * The code for the AWS service.
      */
    var ServiceCode: js.UndefOr[String] = js.native
  }
  object Service {
    
    @scala.inline
    def apply(): Service = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
      
      @scala.inline
      def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    }
  }
  
  type ServiceList = js.Array[Service]
  
  type String = java.lang.String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
