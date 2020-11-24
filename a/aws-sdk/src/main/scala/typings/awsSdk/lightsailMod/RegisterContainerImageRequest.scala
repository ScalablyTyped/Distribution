package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterContainerImageRequest extends js.Object {
  
  /**
    * The digest of the container image to be registered.
    */
  var digest: String = js.native
  
  /**
    * The label for the container image when it's registered to the container service. Use a descriptive label that you can use to track the different versions of your registered container images. Use the GetContainerImages action to return the container images registered to a Lightsail container service. The label is the &lt;imagelabel&gt; portion of the following image name example:    :container-service-1.&lt;imagelabel&gt;.1    If the name of your container service is mycontainerservice, and the label that you specify is mystaticwebsite, then the name of the registered container image will be :mycontainerservice.mystaticwebsite.1. The number at the end of these image name examples represents the version of the registered container image. If you push and register another container image to the same Lightsail container service, with the same label, then the version number for the new registered container image will be 2. If you push and register another container image, the version number will be 3, and so on.
    */
  var label: ContainerLabel = js.native
  
  /**
    * The name of the container service for which to register a container image.
    */
  var serviceName: ContainerServiceName = js.native
}
object RegisterContainerImageRequest {
  
  @scala.inline
  def apply(digest: String, label: ContainerLabel, serviceName: ContainerServiceName): RegisterContainerImageRequest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterContainerImageRequest]
  }
  
  @scala.inline
  implicit class RegisterContainerImageRequestOps[Self <: RegisterContainerImageRequest] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ContainerLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
}
