package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceEndpoint extends js.Object {
  
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
  implicit class ContainerServiceEndpointOps[Self <: ContainerServiceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    
    @scala.inline
    def setContainerPort(value: integer): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: ContainerServiceHealthCheckConfig): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
  }
}
