package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEmailResponse extends js.Object {
  
  /**
    * A unique identifier for the message that is generated when Amazon Pinpoint accepts the message.  It is possible for Amazon Pinpoint to accept a message without sending it. This can happen when the message you're trying to send has an attachment doesn't pass a virus check, or when you send a templated email that contains invalid personalization content, for example. 
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}
object SendEmailResponse {
  
  @scala.inline
  def apply(): SendEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEmailResponse]
  }
  
  @scala.inline
  implicit class SendEmailResponseOps[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
    
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
    def setMessageId(value: OutboundMessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
  }
}
