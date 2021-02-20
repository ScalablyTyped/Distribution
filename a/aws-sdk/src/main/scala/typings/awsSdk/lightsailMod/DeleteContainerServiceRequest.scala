package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContainerServiceRequest extends StObject {
  
  /**
    * The name of the container service to delete.
    */
  var serviceName: ContainerServiceName = js.native
}
object DeleteContainerServiceRequest {
  
  @scala.inline
  def apply(serviceName: ContainerServiceName): DeleteContainerServiceRequest = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerServiceRequest]
  }
  
  @scala.inline
  implicit class DeleteContainerServiceRequestMutableBuilder[Self <: DeleteContainerServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
