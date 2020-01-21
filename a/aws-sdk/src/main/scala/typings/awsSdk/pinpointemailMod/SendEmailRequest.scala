package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailRequest extends js.Object {
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.pinpointemailMod.ConfigurationSetName] = js.native
  /**
    * An object that contains the body of the message. You can send either a Simple message or a Raw message.
    */
  var Content: EmailContent = js.native
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: typings.awsSdk.pinpointemailMod.Destination = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.native
  /**
    * The address that Amazon Pinpoint should send bounce and complaint notifications to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.native
}

object SendEmailRequest {
  @scala.inline
  def apply(
    Content: EmailContent,
    Destination: Destination,
    ConfigurationSetName: ConfigurationSetName = null,
    EmailTags: MessageTagList = null,
    FeedbackForwardingEmailAddress: EmailAddress = null,
    FromEmailAddress: EmailAddress = null,
    ReplyToAddresses: EmailAddressList = null
  ): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName.asInstanceOf[js.Any])
    if (EmailTags != null) __obj.updateDynamic("EmailTags")(EmailTags.asInstanceOf[js.Any])
    if (FeedbackForwardingEmailAddress != null) __obj.updateDynamic("FeedbackForwardingEmailAddress")(FeedbackForwardingEmailAddress.asInstanceOf[js.Any])
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress.asInstanceOf[js.Any])
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailRequest]
  }
}

