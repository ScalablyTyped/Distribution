package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: typings.awsSdk.sesMod.FailureRedirectionURL = js.native
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: FromAddress = js.native
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: typings.awsSdk.sesMod.SuccessRedirectionURL = js.native
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: typings.awsSdk.sesMod.TemplateContent = js.native
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: Subject = js.native
}

object CreateCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(
    FailureRedirectionURL: FailureRedirectionURL,
    FromEmailAddress: FromAddress,
    SuccessRedirectionURL: SuccessRedirectionURL,
    TemplateContent: TemplateContent,
    TemplateName: TemplateName,
    TemplateSubject: Subject
  ): CreateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(FailureRedirectionURL = FailureRedirectionURL.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any], SuccessRedirectionURL = SuccessRedirectionURL.asInstanceOf[js.Any], TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateSubject = TemplateSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
  }
}

