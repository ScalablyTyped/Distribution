package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: typings.awsSdk.sesMod.FailureRedirectionURL
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: FromAddress
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: typings.awsSdk.sesMod.SuccessRedirectionURL
  
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: typings.awsSdk.sesMod.TemplateContent
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: Subject
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
  
  @scala.inline
  implicit class CreateCustomVerificationEmailTemplateRequestMutableBuilder[Self <: CreateCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureRedirectionURL(value: FailureRedirectionURL): Self = StObject.set(x, "FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddress(value: FromAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = StObject.set(x, "SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContent(value: TemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSubject(value: Subject): Self = StObject.set(x, "TemplateSubject", value.asInstanceOf[js.Any])
  }
}
