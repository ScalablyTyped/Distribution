package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneySMSMessage extends js.Object {
  /**
    * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing messages).
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointMod.MessageType] = js.native
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region. For more information, see Supported Countries and Regions in the Amazon Pinpoint User Guide.
    */
  var SenderId: js.UndefOr[string] = js.native
}

object JourneySMSMessage {
  @scala.inline
  def apply(): JourneySMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneySMSMessage]
  }
  @scala.inline
  implicit class JourneySMSMessageOps[Self <: JourneySMSMessage] (val x: Self) extends AnyVal {
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
    def setMessageType(value: MessageType): Self = this.set("MessageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("MessageType", js.undefined)
    @scala.inline
    def setSenderId(value: string): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
  }
  
}

