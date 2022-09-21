package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceIntegrationRequest extends StObject {
  
  /**
    *  An IntegratedServiceConfig object used to specify the integrated service you want to update, and whether you want to update it to enabled or disabled. 
    */
  var ServiceIntegration: UpdateServiceIntegrationConfig
}
object UpdateServiceIntegrationRequest {
  
  inline def apply(ServiceIntegration: UpdateServiceIntegrationConfig): UpdateServiceIntegrationRequest = {
    val __obj = js.Dynamic.literal(ServiceIntegration = ServiceIntegration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceIntegrationRequest]
  }
  
  extension [Self <: UpdateServiceIntegrationRequest](x: Self) {
    
    inline def setServiceIntegration(value: UpdateServiceIntegrationConfig): Self = StObject.set(x, "ServiceIntegration", value.asInstanceOf[js.Any])
  }
}
