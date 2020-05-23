package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelRequest extends js.Object {
  /**
    * The Amazon SES configuration set that you want to apply to messages that you send through the channel.
    */
  var ConfigurationSet: js.UndefOr[string] = js.native
  /**
    * Specifies whether to enable the email channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    *  The verified email address that you want to send email from when you send email through the channel.
    */
  var FromAddress: string = js.native
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you want to use when you send email through the channel.
    */
  var Identity: string = js.native
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object EmailChannelRequest {
  @scala.inline
  def apply(
    FromAddress: string,
    Identity: string,
    ConfigurationSet: string = null,
    Enabled: js.UndefOr[boolean] = js.undefined,
    RoleArn: string = null
  ): EmailChannelRequest = {
    val __obj = js.Dynamic.literal(FromAddress = FromAddress.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelRequest]
  }
}

