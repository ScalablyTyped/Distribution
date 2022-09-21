package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServiceInstanceDeploymentInput extends StObject {
  
  /**
    * The name of the service instance with the deployment to cancel.
    */
  var serviceInstanceName: ResourceName
  
  /**
    * The name of the service with the service instance deployment to cancel.
    */
  var serviceName: ResourceName
}
object CancelServiceInstanceDeploymentInput {
  
  inline def apply(serviceInstanceName: ResourceName, serviceName: ResourceName): CancelServiceInstanceDeploymentInput = {
    val __obj = js.Dynamic.literal(serviceInstanceName = serviceInstanceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServiceInstanceDeploymentInput]
  }
  
  extension [Self <: CancelServiceInstanceDeploymentInput](x: Self) {
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
