package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsMfaConfigType extends StObject {
  
  /**
    * The SMS authentication message that will be sent to users with the code they need to sign in. The message must contain the ‘{####}’ placeholder, which will be replaced with the code. If the message is not included, and default message will be used.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
}
object SmsMfaConfigType {
  
  @scala.inline
  def apply(): SmsMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsMfaConfigType]
  }
  
  @scala.inline
  implicit class SmsMfaConfigTypeMutableBuilder[Self <: SmsMfaConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    @scala.inline
    def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
  }
}
