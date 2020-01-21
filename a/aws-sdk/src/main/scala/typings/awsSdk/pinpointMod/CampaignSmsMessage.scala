package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignSmsMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or time-sensitive, such as a marketing message.
    */
  var MessageType: js.UndefOr[typings.awsSdk.pinpointMod.MessageType] = js.native
  /**
    * The sender ID to display on recipients' devices when they receive the SMS message.
    */
  var SenderId: js.UndefOr[string] = js.native
}

object CampaignSmsMessage {
  @scala.inline
  def apply(Body: string = null, MessageType: MessageType = null, SenderId: string = null): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignSmsMessage]
  }
}

