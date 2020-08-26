package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailRequest extends js.Object {
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesv2Mod.ConfigurationSetName] = js.native
  /**
    * An object that contains the body of the message. You can send either a Simple message Raw message or a template Message.
    */
  var Content: EmailContent = js.native
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: js.UndefOr[typings.awsSdk.sesv2Mod.Destination] = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.native
  /**
    * The address that you want bounce and complaint notifications to be sent to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the FeedbackForwardingEmailAddress parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the FeedbackForwardingEmailAddressIdentityArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the FeedbackForwardingEmailAddress to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the FromEmailAddress parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use sender@example.com, then you would specify the FromEmailAddressIdentityArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the FromEmailAddress to be sender@example.com. For more information about sending authorization, see the Amazon SES Developer Guide. For Raw emails, the FromEmailAddressIdentityArn value overrides the X-SES-SOURCE-ARN and X-SES-FROM-ARN headers specified in raw email message content.
    */
  var FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.native
}

object SendEmailRequest {
  @scala.inline
  def apply(Content: EmailContent): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailRequest]
  }
  @scala.inline
  implicit class SendEmailRequestOps[Self <: SendEmailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: EmailContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
    @scala.inline
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    @scala.inline
    def setEmailTagsVarargs(value: MessageTag*): Self = this.set("EmailTags", js.Array(value :_*))
    @scala.inline
    def setEmailTags(value: MessageTagList): Self = this.set("EmailTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailTags: Self = this.set("EmailTags", js.undefined)
    @scala.inline
    def setFeedbackForwardingEmailAddress(value: EmailAddress): Self = this.set("FeedbackForwardingEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackForwardingEmailAddress: Self = this.set("FeedbackForwardingEmailAddress", js.undefined)
    @scala.inline
    def setFeedbackForwardingEmailAddressIdentityArn(value: AmazonResourceName): Self = this.set("FeedbackForwardingEmailAddressIdentityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackForwardingEmailAddressIdentityArn: Self = this.set("FeedbackForwardingEmailAddressIdentityArn", js.undefined)
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("FromEmailAddress", js.undefined)
    @scala.inline
    def setFromEmailAddressIdentityArn(value: AmazonResourceName): Self = this.set("FromEmailAddressIdentityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmailAddressIdentityArn: Self = this.set("FromEmailAddressIdentityArn", js.undefined)
    @scala.inline
    def setReplyToAddressesVarargs(value: EmailAddress*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    @scala.inline
    def setReplyToAddresses(value: EmailAddressList): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
  }
  
}

