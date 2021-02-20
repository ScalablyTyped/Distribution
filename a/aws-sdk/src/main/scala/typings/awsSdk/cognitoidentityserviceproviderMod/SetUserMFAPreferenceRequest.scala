package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserMFAPreferenceRequest extends StObject {
  
  /**
    * The access token for the user.
    */
  var AccessToken: TokenModelType = js.native
  
  /**
    * The SMS text message multi-factor authentication (MFA) settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.native
  
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.native
}
object SetUserMFAPreferenceRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType): SetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserMFAPreferenceRequest]
  }
  
  @scala.inline
  implicit class SetUserMFAPreferenceRequestMutableBuilder[Self <: SetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMfaSettings(value: SMSMfaSettingsType): Self = StObject.set(x, "SMSMfaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMfaSettingsUndefined: Self = StObject.set(x, "SMSMfaSettings", js.undefined)
    
    @scala.inline
    def setSoftwareTokenMfaSettings(value: SoftwareTokenMfaSettingsType): Self = StObject.set(x, "SoftwareTokenMfaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareTokenMfaSettingsUndefined: Self = StObject.set(x, "SoftwareTokenMfaSettings", js.undefined)
  }
}
