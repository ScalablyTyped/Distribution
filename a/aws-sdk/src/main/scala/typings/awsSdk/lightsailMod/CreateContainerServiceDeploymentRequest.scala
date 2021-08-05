package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerServiceDeploymentRequest extends StObject {
  
  /**
    * An object that describes the settings of the containers that will be launched on the container service.
    */
  var containers: js.UndefOr[ContainerMap] = js.undefined
  
  /**
    * An object that describes the settings of the public endpoint for the container service.
    */
  var publicEndpoint: js.UndefOr[EndpointRequest] = js.undefined
  
  /**
    * The name of the container service for which to create the deployment.
    */
  var serviceName: ContainerServiceName
}
object CreateContainerServiceDeploymentRequest {
  
  inline def apply(serviceName: ContainerServiceName): CreateContainerServiceDeploymentRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerServiceDeploymentRequest]
  }
  
  extension [Self <: CreateContainerServiceDeploymentRequest](x: Self) {
    
    inline def setContainers(value: ContainerMap): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setPublicEndpoint(value: EndpointRequest): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
