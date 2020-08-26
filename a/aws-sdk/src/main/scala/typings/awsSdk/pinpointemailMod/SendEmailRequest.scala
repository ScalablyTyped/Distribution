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
  def apply(Content: EmailContent, Destination: Destination): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
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
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
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
    def setFromEmailAddress(value: EmailAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("FromEmailAddress", js.undefined)
    @scala.inline
    def setReplyToAddressesVarargs(value: EmailAddress*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    @scala.inline
    def setReplyToAddresses(value: EmailAddressList): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
  }
  
}

