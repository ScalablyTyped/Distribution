package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCatalogProvisionedProductDetails extends StObject {
  
  /**
    * The ID of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[ServiceCatalogEntityId] = js.undefined
  
  /**
    * The current status of the product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var ProvisionedProductStatusMessage: js.UndefOr[typings.awsSdk.sagemakerMod.ProvisionedProductStatusMessage] = js.undefined
}
object ServiceCatalogProvisionedProductDetails {
  
  inline def apply(): ServiceCatalogProvisionedProductDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceCatalogProvisionedProductDetails]
  }
  
  extension [Self <: ServiceCatalogProvisionedProductDetails](x: Self) {
    
    inline def setProvisionedProductId(value: ServiceCatalogEntityId): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    inline def setProvisionedProductStatusMessage(value: ProvisionedProductStatusMessage): Self = StObject.set(x, "ProvisionedProductStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductStatusMessageUndefined: Self = StObject.set(x, "ProvisionedProductStatusMessage", js.undefined)
  }
}
