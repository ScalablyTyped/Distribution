package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendTemplatedEmailRequest extends js.Object {
  /**
    * The name of the configuration set to use when you send an email using SendTemplatedEmail.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSetName] = js.native
  /**
    * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50 recipients across these three fields.
    */
  var Destination: typings.awsSdk.sesMod.Destination = js.native
  /**
    * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[AddressList] = js.native
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
    */
  var ReturnPath: js.UndefOr[Address] = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described inRFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
    */
  var Source: Address = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var SourceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var Tags: js.UndefOr[MessageTagList] = js.native
  /**
    * The template to use when sending this email.
    */
  var Template: TemplateName = js.native
  /**
    * The ARN of the template to use when sending this email.
    */
  var TemplateArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: typings.awsSdk.sesMod.TemplateData = js.native
}

object SendTemplatedEmailRequest {
  @scala.inline
  def apply(Destination: Destination, Source: Address, Template: TemplateName, TemplateData: TemplateData): SendTemplatedEmailRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], TemplateData = TemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTemplatedEmailRequest]
  }
  @scala.inline
  implicit class SendTemplatedEmailRequestOps[Self <: SendTemplatedEmailRequest] (val x: Self) extends AnyVal {
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
    def setDestination(value: Destination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Address): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: TemplateName): Self = this.set("Template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateData(value: TemplateData): Self = this.set("TemplateData", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
    @scala.inline
    def setReplyToAddressesVarargs(value: Address*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    @scala.inline
    def setReplyToAddresses(value: AddressList): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
    @scala.inline
    def setReturnPath(value: Address): Self = this.set("ReturnPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPath: Self = this.set("ReturnPath", js.undefined)
    @scala.inline
    def setReturnPathArn(value: AmazonResourceName): Self = this.set("ReturnPathArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPathArn: Self = this.set("ReturnPathArn", js.undefined)
    @scala.inline
    def setSourceArn(value: AmazonResourceName): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    @scala.inline
    def setTagsVarargs(value: MessageTag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: MessageTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTemplateArn(value: AmazonResourceName): Self = this.set("TemplateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateArn: Self = this.set("TemplateArn", js.undefined)
  }
  
}

