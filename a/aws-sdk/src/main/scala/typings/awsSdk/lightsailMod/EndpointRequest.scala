package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointRequest extends StObject {
  
  /**
    * The name of the container for the endpoint.
    */
  var containerName: String = js.native
  
  /**
    * The port of the container to which traffic is forwarded to.
    */
  var containerPort: integer = js.native
  
  /**
    * An object that describes the health check configuration of the container.
    */
  var healthCheck: js.UndefOr[ContainerServiceHealthCheckConfig] = js.native
}
object EndpointRequest {
  
  @scala.inline
  def apply(containerName: String, containerPort: integer): EndpointRequest = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointRequest]
  }
  
  @scala.inline
  implicit class EndpointRequestMutableBuilder[Self <: EndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPort(value: integer): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheck(value: ContainerServiceHealthCheckConfig): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
