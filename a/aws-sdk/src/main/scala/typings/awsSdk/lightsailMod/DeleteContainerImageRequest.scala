package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContainerImageRequest extends js.Object {
  
  /**
    * The name of the container image to delete from the container service. Use the GetContainerImages action to get the name of the container images that are registered to a container service.  Container images sourced from your Lightsail container service, that are registered and stored on your service, start with a colon (:). For example, :container-service-1.mystaticwebsite.1. Container images sourced from a public registry like Docker Hub don't start with a colon. For example, nginx:latest or nginx. 
    */
  var image: String = js.native
  
  /**
    * The name of the container service for which to delete a registered container image.
    */
  var serviceName: ContainerServiceName = js.native
}
object DeleteContainerImageRequest {
  
  @scala.inline
  def apply(image: String, serviceName: ContainerServiceName): DeleteContainerImageRequest = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerImageRequest]
  }
  
  @scala.inline
  implicit class DeleteContainerImageRequestOps[Self <: DeleteContainerImageRequest] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
}
