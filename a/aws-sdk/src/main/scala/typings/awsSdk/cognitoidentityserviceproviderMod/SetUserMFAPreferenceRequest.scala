package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AccessToken: TokenModelType,
    SMSMfaSettings: SMSMfaSettingsType = null,
    SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType = null
  ): SetUserMFAPreferenceRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    if (SMSMfaSettings != null) __obj.updateDynamic("SMSMfaSettings")(SMSMfaSettings.asInstanceOf[js.Any])
    if (SoftwareTokenMfaSettings != null) __obj.updateDynamic("SoftwareTokenMfaSettings")(SoftwareTokenMfaSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserMFAPreferenceRequest]
  }
}

