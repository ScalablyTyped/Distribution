package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUserMFAPreferenceRequest extends js.Object {
  
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
  implicit class SetUserMFAPreferenceRequestOps[Self <: SetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSMfaSettings(value: SMSMfaSettingsType): Self = this.set("SMSMfaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMSMfaSettings: Self = this.set("SMSMfaSettings", js.undefined)
    
    @scala.inline
    def setSoftwareTokenMfaSettings(value: SoftwareTokenMfaSettingsType): Self = this.set("SoftwareTokenMfaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareTokenMfaSettings: Self = this.set("SoftwareTokenMfaSettings", js.undefined)
  }
}
