package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodeAuthorizationMessageResponse extends js.Object {
  
  /**
    * An XML document that contains the decoded message.
    */
  var DecodedMessage: js.UndefOr[decodedMessageType] = js.native
}
object DecodeAuthorizationMessageResponse {
  
  @scala.inline
  def apply(): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
  
  @scala.inline
  implicit class DecodeAuthorizationMessageResponseOps[Self <: DecodeAuthorizationMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setDecodedMessage(value: decodedMessageType): Self = this.set("DecodedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodedMessage: Self = this.set("DecodedMessage", js.undefined)
  }
}
