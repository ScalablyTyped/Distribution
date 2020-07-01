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
  def apply(MessageType: MessageType = null, SenderId: string = null): JourneySMSMessage = {
    val __obj = js.Dynamic.literal()
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneySMSMessage]
  }
}

