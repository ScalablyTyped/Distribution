package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCustomVerificationEmailRequest extends StObject {
  
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesv2Mod.ConfigurationSetName] = js.native
  
  /**
    * The email address to verify.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
  
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: EmailTemplateName = js.native
}
object SendCustomVerificationEmailRequest {
  
  @scala.inline
  def apply(EmailAddress: EmailAddress, TemplateName: EmailTemplateName): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
  
  @scala.inline
  implicit class SendCustomVerificationEmailRequestMutableBuilder[Self <: SendCustomVerificationEmailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
