package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the email channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The configuration set that's applied to email that's sent through the channel by using the Amazon Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the email channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.native
  /**
    * Specifies whether the email channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The verified email address that you send email from when you send email through the channel.
    */
  var FromAddress: js.UndefOr[string] = js.native
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.native
  /**
    * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you use when you send email through the channel.
    */
  var Identity: js.UndefOr[string] = js.native
  /**
    * Specifies whether the email channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.native
  /**
    * The user who last modified the email channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when the email channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The maximum number of emails that you can send through the channel each second.
    */
  var MessagesPerSecond: js.UndefOr[integer] = js.native
  /**
    * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
    */
  var Platform: string = js.native
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * The current version of the email channel.
    */
  var Version: js.UndefOr[integer] = js.native
}

object EmailChannelResponse {
  @scala.inline
  def apply(
    Platform: string,
    ApplicationId: string = null,
    ConfigurationSet: string = null,
    CreationDate: string = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    FromAddress: string = null,
    HasCredential: js.UndefOr[Boolean] = js.undefined,
    Id: string = null,
    Identity: string = null,
    IsArchived: js.UndefOr[Boolean] = js.undefined,
    LastModifiedBy: string = null,
    LastModifiedDate: string = null,
    MessagesPerSecond: Int | Double = null,
    RoleArn: string = null,
    Version: Int | Double = null
  ): EmailChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
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
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelResponse]
  }
}

