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

object marketplaceentitlementserviceMod {
  
  @JSImport("aws-sdk/clients/marketplaceentitlementservice", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends MarketplaceEntitlementService {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  type Boolean = scala.Boolean
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.apiVersion] = js.native
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
  
  type Double = scala.Double
  
  @js.native
  trait Entitlement extends StObject {
    
    /**
      * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
      */
    var CustomerIdentifier: js.UndefOr[NonEmptyString] = js.native
    
    /**
      * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and are specified when the product is listed in AWS Marketplace.
      */
    var Dimension: js.UndefOr[NonEmptyString] = js.native
    
    /**
      * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an expiration date.
      */
    var ExpirationDate: js.UndefOr[Timestamp] = js.native
    
    /**
      * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the product listing is created.
      */
    var ProductCode: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.ProductCode] = js.native
    
    /**
      * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
      */
    var Value: js.UndefOr[EntitlementValue] = js.native
  }
  object Entitlement {
    
    @scala.inline
    def apply(): Entitlement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entitlement]
    }
    
    @scala.inline
    implicit class EntitlementMutableBuilder[Self <: Entitlement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomerIdentifier(value: NonEmptyString): Self = StObject.set(x, "CustomerIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerIdentifierUndefined: Self = StObject.set(x, "CustomerIdentifier", js.undefined)
      
      @scala.inline
      def setDimension(value: NonEmptyString): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionUndefined: Self = StObject.set(x, "Dimension", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
      
      @scala.inline
      def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductCodeUndefined: Self = StObject.set(x, "ProductCode", js.undefined)
      
      @scala.inline
      def setValue(value: EntitlementValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type EntitlementList = js.Array[Entitlement]
  
  @js.native
  trait EntitlementValue extends StObject {
    
    /**
      * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise, the field will not be set.
      */
    var BooleanValue: js.UndefOr[Boolean] = js.native
    
    /**
      * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the field will not be set.
      */
    var DoubleValue: js.UndefOr[Double] = js.native
    
    /**
      * The IntegerValue field will be populated with an integer value when the entitlement is an integer type. Otherwise, the field will not be set.
      */
    var IntegerValue: js.UndefOr[Integer] = js.native
    
    /**
      * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the field will not be set.
      */
    var StringValue: js.UndefOr[String] = js.native
  }
  object EntitlementValue {
    
    @scala.inline
    def apply(): EntitlementValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntitlementValue]
    }
    
    @scala.inline
    implicit class EntitlementValueMutableBuilder[Self <: EntitlementValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBooleanValue(value: Boolean): Self = StObject.set(x, "BooleanValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanValueUndefined: Self = StObject.set(x, "BooleanValue", js.undefined)
      
      @scala.inline
      def setDoubleValue(value: Double): Self = StObject.set(x, "DoubleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleValueUndefined: Self = StObject.set(x, "DoubleValue", js.undefined)
      
      @scala.inline
      def setIntegerValue(value: Integer): Self = StObject.set(x, "IntegerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerValueUndefined: Self = StObject.set(x, "IntegerValue", js.undefined)
      
      @scala.inline
      def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
    }
  }
  
  type FilterValue = java.lang.String
  
  type FilterValueList = js.Array[FilterValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CUSTOMER_IDENTIFIER
    - typings.awsSdk.awsSdkStrings.DIMENSION
    - java.lang.String
  */
  type GetEntitlementFilterName = _GetEntitlementFilterName | java.lang.String
  
  type GetEntitlementFilters = StringDictionary[FilterValueList]
  
  @js.native
  trait GetEntitlementsRequest extends StObject {
    
    /**
      * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described as keys mapped to a lists of values. Filtered requests are unioned for each value in the value list, and then intersected for each filter key.
      */
    var Filter: js.UndefOr[GetEntitlementFilters] = js.native
    
    /**
      * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken field in subsequent calls to GetEntitlements.
      */
    var MaxResults: js.UndefOr[Integer] = js.native
    
    /**
      * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.native
    
    /**
      * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS Marketplace when the product listing is created.
      */
    var ProductCode: typings.awsSdk.marketplaceentitlementserviceMod.ProductCode = js.native
  }
  object GetEntitlementsRequest {
    
    @scala.inline
    def apply(ProductCode: ProductCode): GetEntitlementsRequest = {
      val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEntitlementsRequest]
    }
    
    @scala.inline
    implicit class GetEntitlementsRequestMutableBuilder[Self <: GetEntitlementsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: GetEntitlementFilters): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetEntitlementsResult extends StObject {
    
    /**
      * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
      */
    var Entitlements: js.UndefOr[EntitlementList] = js.native
    
    /**
      * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.native
  }
  object GetEntitlementsResult {
    
    @scala.inline
    def apply(): GetEntitlementsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEntitlementsResult]
    }
    
    @scala.inline
    implicit class GetEntitlementsResultMutableBuilder[Self <: GetEntitlementsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntitlements(value: EntitlementList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
      
      @scala.inline
      def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  type Integer = scala.Double
  
  @js.native
  trait MarketplaceEntitlementService extends Service {
    
    @JSName("config")
    var config_MarketplaceEntitlementService: ConfigBase with ClientConfiguration = js.native
    
    /**
      * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
      */
    def getEntitlements(): Request[GetEntitlementsResult, AWSError] = js.native
    def getEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ GetEntitlementsResult, Unit]): Request[GetEntitlementsResult, AWSError] = js.native
    /**
      * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
      */
    def getEntitlements(params: GetEntitlementsRequest): Request[GetEntitlementsResult, AWSError] = js.native
    def getEntitlements(
      params: GetEntitlementsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetEntitlementsResult, Unit]
    ): Request[GetEntitlementsResult, AWSError] = js.native
  }
  
  type NonEmptyString = java.lang.String
  
  type ProductCode = java.lang.String
  
  type String = java.lang.String
  
  type Timestamp = Date
  
  trait _GetEntitlementFilterName extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-01-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
