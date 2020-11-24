package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendBounceResponse extends js.Object {
  
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.native
}
object SendBounceResponse {
  
  @scala.inline
  def apply(): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBounceResponse]
  }
  
  @scala.inline
  implicit class SendBounceResponseOps[Self <: SendBounceResponse] (val x: Self) extends AnyVal {
    
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
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
  }
}
