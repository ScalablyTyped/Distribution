package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerImageRequest extends StObject {
  
  /**
    * The digest of the container image to be registered.
    */
  var digest: String
  
  /**
    * The label for the container image when it's registered to the container service. Use a descriptive label that you can use to track the different versions of your registered container images. Use the GetContainerImages action to return the container images registered to a Lightsail container service. The label is the &lt;imagelabel&gt; portion of the following image name example:    :container-service-1.&lt;imagelabel&gt;.1    If the name of your container service is mycontainerservice, and the label that you specify is mystaticwebsite, then the name of the registered container image will be :mycontainerservice.mystaticwebsite.1. The number at the end of these image name examples represents the version of the registered container image. If you push and register another container image to the same Lightsail container service, with the same label, then the version number for the new registered container image will be 2. If you push and register another container image, the version number will be 3, and so on.
    */
  var label: ContainerLabel
  
  /**
    * The name of the container service for which to register a container image.
    */
  var serviceName: ContainerServiceName
}
object RegisterContainerImageRequest {
  
  @scala.inline
  def apply(digest: String, label: ContainerLabel, serviceName: ContainerServiceName): RegisterContainerImageRequest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterContainerImageRequest]
  }
  
  @scala.inline
  implicit class RegisterContainerImageRequestMutableBuilder[Self <: RegisterContainerImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ContainerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
