package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceResponse extends StObject {
  
  /**
    * The full description of your service following the create call. A service will return either a capacityProviderStrategy or launchType parameter, but not both, depending where one was specified when it was created. If a service is using the ECS deployment controller, the deploymentController and taskSets parameters will not be returned. if the service uses the CODE_DEPLOY deployment controller, the deploymentController, taskSets and deployments parameters will be returned, however the deployments parameter will be an empty list.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object CreateServiceResponse {
  
  inline def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  
  extension [Self <: CreateServiceResponse](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
