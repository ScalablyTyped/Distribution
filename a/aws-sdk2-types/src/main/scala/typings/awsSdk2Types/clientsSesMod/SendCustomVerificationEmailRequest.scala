package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCustomVerificationEmailRequest extends StObject {
  
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk2Types.clientsSesMod.ConfigurationSetName] = js.undefined
  
  /**
    * The email address to verify.
    */
  var EmailAddress: Address
  
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: typings.awsSdk2Types.clientsSesMod.TemplateName
}
object SendCustomVerificationEmailRequest {
  
  inline def apply(EmailAddress: Address, TemplateName: TemplateName): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendCustomVerificationEmailRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
