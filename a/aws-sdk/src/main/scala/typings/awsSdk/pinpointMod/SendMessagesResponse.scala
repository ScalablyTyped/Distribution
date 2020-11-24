package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessagesResponse extends js.Object {
  
  var MessageResponse: typings.awsSdk.pinpointMod.MessageResponse = js.native
}
object SendMessagesResponse {
  
  @scala.inline
  def apply(MessageResponse: MessageResponse): SendMessagesResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesResponse]
  }
  
  @scala.inline
  implicit class SendMessagesResponseOps[Self <: SendMessagesResponse] (val x: Self) extends AnyVal {
    
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
    def setMessageResponse(value: MessageResponse): Self = this.set("MessageResponse", value.asInstanceOf[js.Any])
  }
}
