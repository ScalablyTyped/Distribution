package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomVerificationEmailTemplateMetadata extends StObject {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typings.awsSdk.sesv2Mod.FailureRedirectionURL] = js.native
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typings.awsSdk.sesv2Mod.SuccessRedirectionURL] = js.native
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.native
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[EmailTemplateSubject] = js.native
}
object CustomVerificationEmailTemplateMetadata {
  
  @scala.inline
  def apply(): CustomVerificationEmailTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomVerificationEmailTemplateMetadata]
  }
  
  @scala.inline
  implicit class CustomVerificationEmailTemplateMetadataMutableBuilder[Self <: CustomVerificationEmailTemplateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureRedirectionURL(value: FailureRedirectionURL): Self = StObject.set(x, "FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureRedirectionURLUndefined: Self = StObject.set(x, "FailureRedirectionURL", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = StObject.set(x, "SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRedirectionURLUndefined: Self = StObject.set(x, "SuccessRedirectionURL", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateSubject(value: EmailTemplateSubject): Self = StObject.set(x, "TemplateSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSubjectUndefined: Self = StObject.set(x, "TemplateSubject", js.undefined)
  }
}
