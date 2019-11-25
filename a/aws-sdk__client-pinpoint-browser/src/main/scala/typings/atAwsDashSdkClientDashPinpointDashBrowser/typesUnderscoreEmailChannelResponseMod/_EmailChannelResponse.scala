package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailChannelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EmailChannelResponse extends js.Object {
  /**
    * The unique ID of the application to which the email channel belongs.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The configuration set that you want to use when you send email using the Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[String] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The email address used to send emails from.
    */
  var FromAddress: js.UndefOr[String] = js.undefined
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.undefined
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an identity verified with SES.
    */
  var Identity: js.UndefOr[String] = js.undefined
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[Boolean] = js.undefined
  /**
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * Messages per second that can be sent
    */
  var MessagesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * Platform type. Will be "EMAIL"
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object _EmailChannelResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    ConfigurationSet: String = null,
    CreationDate: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    FromAddress: String = null,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: String = null,
    Identity: String = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: String = null,
    LastModifiedDate: String = null,
    MessagesPerSecond: Int | Double = null,
    Platform: String = null,
    RoleArn: String = null,
    Version: Int | Double = null
  ): _EmailChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (ConfigurationSet != null) __obj.updateDynamic("ConfigurationSet")(ConfigurationSet.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Identity != null) __obj.updateDynamic("Identity")(Identity.asInstanceOf[js.Any])
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (MessagesPerSecond != null) __obj.updateDynamic("MessagesPerSecond")(MessagesPerSecond.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EmailChannelResponse]
  }
}

