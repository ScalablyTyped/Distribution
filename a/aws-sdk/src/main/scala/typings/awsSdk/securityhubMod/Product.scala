package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  /**
    * The URL used to activate the product.
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
    * The types of integration that the product supports. Available values are the following.    SEND_FINDINGS_TO_SECURITY_HUB - Indicates that the integration sends findings to Security Hub.    RECEIVE_FINDINGS_FROM_SECURITY_HUB - Indicates that the integration receives findings from Security Hub.  
    */
  var IntegrationTypes: js.UndefOr[IntegrationTypeList] = js.undefined
  
  /**
    * The URL for the page that contains more information about the product.
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
    
    inline def setCategoriesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Categories", js.Array(value :_*))
    
    inline def setCompanyName(value: NonEmptyString): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIntegrationTypes(value: IntegrationTypeList): Self = StObject.set(x, "IntegrationTypes", value.asInstanceOf[js.Any])
    
    inline def setIntegrationTypesUndefined: Self = StObject.set(x, "IntegrationTypes", js.undefined)
    
    inline def setIntegrationTypesVarargs(value: IntegrationType*): Self = StObject.set(x, "IntegrationTypes", js.Array(value :_*))
    
    inline def setMarketplaceUrl(value: NonEmptyString): Self = StObject.set(x, "MarketplaceUrl", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceUrlUndefined: Self = StObject.set(x, "MarketplaceUrl", js.undefined)
    
    inline def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: NonEmptyString): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setProductSubscriptionResourcePolicy(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setProductSubscriptionResourcePolicyUndefined: Self = StObject.set(x, "ProductSubscriptionResourcePolicy", js.undefined)
  }
}
