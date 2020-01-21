package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The SMS message type. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message is not critical or time-sensitive, such as a marketing message.
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
  def apply(
    Body: string = null,
    Keyword: string = null,
    MessageType: MessageType = null,
    OriginationNumber: string = null,
    SenderId: string = null,
    Substitutions: MapOfListOfString = null
  ): SMSMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSMessage]
  }
}

