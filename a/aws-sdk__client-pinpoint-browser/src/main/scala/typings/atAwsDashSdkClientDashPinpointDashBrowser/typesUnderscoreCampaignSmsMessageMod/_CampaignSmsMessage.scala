package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignSmsMessageMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.PROMOTIONAL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignSmsMessage extends js.Object {
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

object _CampaignSmsMessage {
  @scala.inline
  def apply(
    Body: String = null,
    MessageType: TRANSACTIONAL | PROMOTIONAL | String = null,
    SenderId: String = null
  ): _CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    __obj.asInstanceOf[_CampaignSmsMessage]
  }
}

