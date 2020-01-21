package typings.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSmsMessage extends js.Object {
  /**
    * The SMS text body.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * Is this is a transactional SMS message, otherwise a promotional message.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.undefined
  /**
    * Sender ID of sent message.
    */
  var SenderId: js.UndefOr[String] = js.undefined
}

object CampaignSmsMessage {
  @scala.inline
  def apply(
    Body: String = null,
    MessageType: TRANSACTIONAL | PROMOTIONAL | String = null,
    SenderId: String = null
  ): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignSmsMessage]
  }
}

