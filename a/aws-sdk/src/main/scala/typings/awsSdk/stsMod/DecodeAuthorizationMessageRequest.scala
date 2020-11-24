package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodeAuthorizationMessageRequest extends js.Object {
  
  /**
    * The encoded message that was returned with the response.
    */
  var EncodedMessage: encodedMessageType = js.native
}
object DecodeAuthorizationMessageRequest {
  
  @scala.inline
  def apply(EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal(EncodedMessage = EncodedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
  
  @scala.inline
  implicit class DecodeAuthorizationMessageRequestOps[Self <: DecodeAuthorizationMessageRequest] (val x: Self) extends AnyVal {
    
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
    def setEncodedMessage(value: encodedMessageType): Self = this.set("EncodedMessage", value.asInstanceOf[js.Any])
  }
}
