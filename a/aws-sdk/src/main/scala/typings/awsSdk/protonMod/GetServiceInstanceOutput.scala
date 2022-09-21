package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInstanceOutput extends StObject {
  
  /**
    * The detailed data of the requested service instance.
    */
  var serviceInstance: ServiceInstance
}
object GetServiceInstanceOutput {
  
  inline def apply(serviceInstance: ServiceInstance): GetServiceInstanceOutput = {
    val __obj = js.Dynamic.literal(serviceInstance = serviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInstanceOutput]
  }
  
  extension [Self <: GetServiceInstanceOutput](x: Self) {
    
    inline def setServiceInstance(value: ServiceInstance): Self = StObject.set(x, "serviceInstance", value.asInstanceOf[js.Any])
  }
}
