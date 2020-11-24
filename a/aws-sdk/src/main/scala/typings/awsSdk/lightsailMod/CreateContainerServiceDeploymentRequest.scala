package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContainerServiceDeploymentRequest extends js.Object {
  
  /**
    * An object that describes the settings of the containers that will be launched on the container service.
    */
  var containers: js.UndefOr[ContainerMap] = js.native
  
  /**
    * An object that describes the settings of the public endpoint for the container service.
    */
  var publicEndpoint: js.UndefOr[EndpointRequest] = js.native
  
  /**
    * The name of the container service for which to create the deployment.
    */
  var serviceName: ContainerServiceName = js.native
}
object CreateContainerServiceDeploymentRequest {
  
  @scala.inline
  def apply(serviceName: ContainerServiceName): CreateContainerServiceDeploymentRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerServiceDeploymentRequest]
  }
  
  @scala.inline
  implicit class CreateContainerServiceDeploymentRequestOps[Self <: CreateContainerServiceDeploymentRequest] (val x: Self) extends AnyVal {
    
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
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
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
