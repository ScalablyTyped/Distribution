package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContactMethodRequest extends js.Object {
  
  /**
    * The protocol that will be deleted, such as Email or SMS (text messaging).  To delete an Email and an SMS contact method if you added both, you must run separate DeleteContactMethod actions to delete each protocol. 
    */
  var protocol: ContactProtocol = js.native
}
object DeleteContactMethodRequest {
  
  @scala.inline
  def apply(protocol: ContactProtocol): DeleteContactMethodRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactMethodRequest]
  }
  
  @scala.inline
  implicit class DeleteContactMethodRequestOps[Self <: DeleteContactMethodRequest] (val x: Self) extends AnyVal {
    
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
    def setProtocol(value: ContactProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
}
