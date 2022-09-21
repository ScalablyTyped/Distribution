package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  /**
    * The URL to the service or product documentation about the integration with Security Hub, including how to activate the integration.
    */
  var ActivationUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The categories assigned to the product.
    */
  var Categories: js.UndefOr[CategoryList] = js.undefined
  
  /**
    * The name of the company that provides the product.
    */
  var CompanyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A description of the product.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The types of integration that the product supports. Available values are the following.    SEND_FINDINGS_TO_SECURITY_HUB - The integration sends findings to Security Hub.    RECEIVE_FINDINGS_FROM_SECURITY_HUB - The integration receives findings from Security Hub.    UPDATE_FINDINGS_IN_SECURITY_HUB - The integration does not send new findings to Security Hub, but does make updates to the findings that it receives from Security Hub.  
    */
  var IntegrationTypes: js.UndefOr[IntegrationTypeList] = js.undefined
  
  /**
    * For integrations with Amazon Web Services services, the Amazon Web Services Console URL from which to activate the service. For integrations with third-party products, the Amazon Web Services Marketplace URL from which to subscribe to or purchase the product.
    */
  var MarketplaceUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN assigned to the product.
    */
  var ProductArn: NonEmptyString
  
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The resource policy associated with the product.
    */
  var ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString] = js.undefined
}
object Product {
  
  inline def apply(ProductArn: NonEmptyString): Product = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setActivationUrl(value: NonEmptyString): Self = StObject.set(x, "ActivationUrl", value.asInstanceOf[js.Any])
    
    inline def setActivationUrlUndefined: Self = StObject.set(x, "ActivationUrl", js.undefined)
    
    inline def setCategories(value: CategoryList): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    inline def setCategoriesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Categories", js.Array(value*))
    
    inline def setCompanyName(value: NonEmptyString): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIntegrationTypes(value: IntegrationTypeList): Self = StObject.set(x, "IntegrationTypes", value.asInstanceOf[js.Any])
    
    inline def setIntegrationTypesUndefined: Self = StObject.set(x, "IntegrationTypes", js.undefined)
    
    inline def setIntegrationTypesVarargs(value: IntegrationType*): Self = StObject.set(x, "IntegrationTypes", js.Array(value*))
    
    inline def setMarketplaceUrl(value: NonEmptyString): Self = StObject.set(x, "MarketplaceUrl", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceUrlUndefined: Self = StObject.set(x, "MarketplaceUrl", js.undefined)
    
    inline def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: NonEmptyString): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setProductSubscriptionResourcePolicy(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setProductSubscriptionResourcePolicyUndefined: Self = StObject.set(x, "ProductSubscriptionResourcePolicy", js.undefined)
  }
}
