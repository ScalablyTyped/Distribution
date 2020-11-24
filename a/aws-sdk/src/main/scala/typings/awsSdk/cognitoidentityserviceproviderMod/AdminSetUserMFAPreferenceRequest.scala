package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminSetUserMFAPreferenceRequest extends js.Object {
  
  /**
    * The SMS text message MFA settings.
    */
  var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.native
  
  /**
    * The time-based one-time password software token MFA settings.
    */
  var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  
  /**
    * The user pool username or alias.
    */
  var Username: UsernameType = js.native
}
object AdminSetUserMFAPreferenceRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserMFAPreferenceRequest]
  }
  
  @scala.inline
  implicit class AdminSetUserMFAPreferenceRequestOps[Self <: AdminSetUserMFAPreferenceRequest] (val x: Self) extends AnyVal {
    
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
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
