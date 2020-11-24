package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMSMessage extends js.Object {
  
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[string] = js.native
  
  /**
    * This field is reserved for future use.
    */
  var MediaUrl: js.UndefOr[string] = js.native
  
  /**
    * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing messages).
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointMod.MessageType] = js.native
  
  /**
    * The number to send the SMS message from. This value should be one of the dedicated long or short codes that's assigned to your AWS account. If you don't specify a long or short code, Amazon Pinpoint assigns a random long code to the SMS message and sends the message from that code.
    */
  var OriginationNumber: js.UndefOr[string] = js.native
  
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[string] = js.native
  
  /**
    * The message variables to use in the SMS message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}
object SMSMessage {
  
  @scala.inline
  def apply(): SMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMessage]
  }
  
  @scala.inline
  implicit class SMSMessageOps[Self <: SMSMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setKeyword(value: string): Self = this.set("Keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("Keyword", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: string): Self = this.set("MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaUrl: Self = this.set("MediaUrl", js.undefined)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = this.set("MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("MessageType", js.undefined)
    
    @scala.inline
    def setOriginationNumber(value: string): Self = this.set("OriginationNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginationNumber: Self = this.set("OriginationNumber", js.undefined)
    
    @scala.inline
    def setSenderId(value: string): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
}
