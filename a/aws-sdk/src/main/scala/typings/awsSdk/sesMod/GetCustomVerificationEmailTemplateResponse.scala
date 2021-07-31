package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomVerificationEmailTemplateResponse extends StObject {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typings.awsSdk.sesMod.FailureRedirectionURL] = js.undefined
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typings.awsSdk.sesMod.SuccessRedirectionURL] = js.undefined
  
  /**
    * The content of the custom verification email.
    */
  var TemplateContent: js.UndefOr[typings.awsSdk.sesMod.TemplateContent] = js.undefined
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[typings.awsSdk.sesMod.TemplateName] = js.undefined
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.undefined
}
object GetCustomVerificationEmailTemplateResponse {
  
  @scala.inline
  def apply(): GetCustomVerificationEmailTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateResponse]
  }
  
  @scala.inline
  implicit class GetCustomVerificationEmailTemplateResponseMutableBuilder[Self <: GetCustomVerificationEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureRedirectionURL(value: FailureRedirectionURL): Self = StObject.set(x, "FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureRedirectionURLUndefined: Self = StObject.set(x, "FailureRedirectionURL", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: FromAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = StObject.set(x, "SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRedirectionURLUndefined: Self = StObject.set(x, "SuccessRedirectionURL", js.undefined)
    
    @scala.inline
    def setTemplateContent(value: TemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContentUndefined: Self = StObject.set(x, "TemplateContent", js.undefined)
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateSubject(value: Subject): Self = StObject.set(x, "TemplateSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSubjectUndefined: Self = StObject.set(x, "TemplateSubject", js.undefined)
  }
}
