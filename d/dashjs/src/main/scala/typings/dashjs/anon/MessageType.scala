package typings.dashjs.anon

import typings.dashjs.mod.SessionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageType extends js.Object {
  
  var messageType: String = js.native
  
  var sessionToken: SessionToken = js.native
}
object MessageType {
  
  @scala.inline
  def apply(messageType: String, sessionToken: SessionToken): MessageType = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit class MessageTypeOps[Self <: MessageType] (val x: Self) extends AnyVal {
    
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
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionToken(value: SessionToken): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
  }
}
