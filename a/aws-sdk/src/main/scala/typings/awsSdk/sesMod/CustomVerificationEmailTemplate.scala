package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomVerificationEmailTemplate extends js.Object {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typings.awsSdk.sesMod.FailureRedirectionURL] = js.native
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.native
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typings.awsSdk.sesMod.SuccessRedirectionURL] = js.native
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[typings.awsSdk.sesMod.TemplateName] = js.native
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.native
}
object CustomVerificationEmailTemplate {
  
  @scala.inline
  def apply(): CustomVerificationEmailTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomVerificationEmailTemplate]
  }
  
  @scala.inline
  implicit class CustomVerificationEmailTemplateOps[Self <: CustomVerificationEmailTemplate] (val x: Self) extends AnyVal {
    
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
    def setFailureRedirectionURL(value: FailureRedirectionURL): Self = this.set("FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureRedirectionURL: Self = this.set("FailureRedirectionURL", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: FromAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("FromEmailAddress", js.undefined)
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = this.set("SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRedirectionURL: Self = this.set("SuccessRedirectionURL", js.undefined)
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateSubject(value: Subject): Self = this.set("TemplateSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateSubject: Self = this.set("TemplateSubject", js.undefined)
  }
}
