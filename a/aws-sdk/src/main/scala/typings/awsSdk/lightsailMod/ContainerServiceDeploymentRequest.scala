package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceDeploymentRequest extends js.Object {
  
  /**
    * An object that describes the configuration for the containers of the deployment.
    */
  var containers: js.UndefOr[ContainerMap] = js.native
  
  /**
    * An object that describes the endpoint of the deployment.
    */
  var publicEndpoint: js.UndefOr[EndpointRequest] = js.native
}
object ContainerServiceDeploymentRequest {
  
  @scala.inline
  def apply(): ContainerServiceDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceDeploymentRequest]
  }
  
  @scala.inline
  implicit class ContainerServiceDeploymentRequestOps[Self <: ContainerServiceDeploymentRequest] (val x: Self) extends AnyVal {
    
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
    def setContainers(value: ContainerMap): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: EndpointRequest): Self = this.set("publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicEndpoint: Self = this.set("publicEndpoint", js.undefined)
  }
}
