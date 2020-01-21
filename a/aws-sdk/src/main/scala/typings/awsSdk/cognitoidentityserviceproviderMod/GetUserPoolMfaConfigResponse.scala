package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPoolMfaConfigResponse extends js.Object {
  /**
    * The multi-factor (MFA) configuration. Valid values include:    OFF MFA will not be used for any users.    ON MFA is required for all users to sign in.    OPTIONAL MFA will be required only for individual users who have an MFA factor enabled.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The SMS text message multi-factor (MFA) configuration.
    */
  var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.native
  /**
    * The software token multi-factor (MFA) configuration.
    */
  var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.native
}

object GetUserPoolMfaConfigResponse {
  @scala.inline
  def apply(
    MfaConfiguration: UserPoolMfaType = null,
    SmsMfaConfiguration: SmsMfaConfigType = null,
    SoftwareTokenMfaConfiguration: SoftwareTokenMfaConfigType = null
  ): GetUserPoolMfaConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (SmsMfaConfiguration != null) __obj.updateDynamic("SmsMfaConfiguration")(SmsMfaConfiguration.asInstanceOf[js.Any])
    if (SoftwareTokenMfaConfiguration != null) __obj.updateDynamic("SoftwareTokenMfaConfiguration")(SoftwareTokenMfaConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPoolMfaConfigResponse]
  }
}

