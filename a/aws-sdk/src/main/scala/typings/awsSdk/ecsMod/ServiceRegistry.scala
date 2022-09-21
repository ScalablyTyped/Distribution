package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceRegistry extends StObject {
  
  /**
    * The container name value to be used for your service discovery service. It's already specified in the task definition. If the task definition that your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition that your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value. However, you can't specify both.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The port value to be used for your service discovery service. It's already specified in the task definition. If the task definition your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value. However, you can't specify both.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The port value used if your service discovery service specified an SRV record. This field might be used if both the awsvpc network mode and SRV records are used.
    */
  var port: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is Cloud Map. For more information, see CreateService.
    */
  var registryArn: js.UndefOr[String] = js.undefined
}
object ServiceRegistry {
  
  inline def apply(): ServiceRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceRegistry]
  }
  
  extension [Self <: ServiceRegistry](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContainerPort(value: BoxedInteger): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setPort(value: BoxedInteger): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRegistryArn(value: String): Self = StObject.set(x, "registryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "registryArn", js.undefined)
  }
}
