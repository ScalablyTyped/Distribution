package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointGroupRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString = js.native
}
object DeleteEndpointGroupRequest {
  
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DeleteEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointGroupRequestOps[Self <: DeleteEndpointGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setEndpointGroupArn(value: GenericString): Self = this.set("EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
