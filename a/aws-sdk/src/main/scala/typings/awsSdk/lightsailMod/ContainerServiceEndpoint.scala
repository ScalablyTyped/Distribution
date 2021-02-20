package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceEndpoint extends StObject {
  
  /**
    * The name of the container entry of the deployment that the endpoint configuration applies to.
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * The port of the specified container to which traffic is forwarded to.
    */
  var containerPort: js.UndefOr[integer] = js.native
  
  /**
    * An object that describes the health check configuration of the container.
    */
  var healthCheck: js.UndefOr[ContainerServiceHealthCheckConfig] = js.native
}
object ContainerServiceEndpoint {
  
  @scala.inline
  def apply(): ContainerServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceEndpoint]
  }
  
  @scala.inline
  implicit class ContainerServiceEndpointMutableBuilder[Self <: ContainerServiceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContainerPort(value: integer): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: ContainerServiceHealthCheckConfig): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
