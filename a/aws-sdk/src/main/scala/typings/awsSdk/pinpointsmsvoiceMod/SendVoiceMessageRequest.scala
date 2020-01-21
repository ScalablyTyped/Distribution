package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendVoiceMessageRequest extends js.Object {
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.native
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
  var Content: js.UndefOr[VoiceMessageContent] = js.native
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.native
}

object SendVoiceMessageRequest {
  @scala.inline
  def apply(
    CallerId: String = null,
    ConfigurationSetName: WordCharactersWithDelimiters = null,
    Content: VoiceMessageContent = null,
    DestinationPhoneNumber: NonEmptyString = null,
    OriginationPhoneNumber: NonEmptyString = null
  ): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    if (CallerId != null) __obj.updateDynamic("CallerId")(CallerId.asInstanceOf[js.Any])
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (DestinationPhoneNumber != null) __obj.updateDynamic("DestinationPhoneNumber")(DestinationPhoneNumber.asInstanceOf[js.Any])
    if (OriginationPhoneNumber != null) __obj.updateDynamic("OriginationPhoneNumber")(OriginationPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
}

