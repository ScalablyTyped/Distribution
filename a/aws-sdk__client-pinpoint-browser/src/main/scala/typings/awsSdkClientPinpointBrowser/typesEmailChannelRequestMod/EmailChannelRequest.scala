package typings.awsSdkClientPinpointBrowser.typesEmailChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelRequest extends js.Object {
  /**
    * The configuration set that you want to use when you send email using the Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The email address used to send emails from.
    */
  var FromAddress: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an identity verified with SES.
    */
  var Identity: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
    */
  var RoleArn: js.UndefOr[String] = js.undefined
}

object EmailChannelRequest {
  @scala.inline
  def apply(
    ConfigurationSet: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    FromAddress: String = null,
    Identity: String = null,
    RoleArn: String = null
  ): EmailChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (Identity != null) __obj.updateDynamic("Identity")(Identity.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelRequest]
  }
}

