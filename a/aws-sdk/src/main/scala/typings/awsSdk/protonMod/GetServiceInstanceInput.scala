package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInstanceInput extends StObject {
  
  /**
    * The name of a service instance that you want to get the detailed data for.
    */
  var name: ResourceName
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: ResourceName
}
object GetServiceInstanceInput {
  
  inline def apply(name: ResourceName, serviceName: ResourceName): GetServiceInstanceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInstanceInput]
  }
  
  extension [Self <: GetServiceInstanceInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
