package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContainerServiceRequest extends js.Object {
  
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
  implicit class DeleteContainerServiceRequestOps[Self <: DeleteContainerServiceRequest] (val x: Self) extends AnyVal {
    
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
  }
}
