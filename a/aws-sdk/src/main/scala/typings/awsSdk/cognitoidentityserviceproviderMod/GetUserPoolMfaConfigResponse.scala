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
  def apply(): GetUserPoolMfaConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserPoolMfaConfigResponse]
  }
  @scala.inline
  implicit class GetUserPoolMfaConfigResponseOps[Self <: GetUserPoolMfaConfigResponse] (val x: Self) extends AnyVal {
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
    def setMfaConfiguration(value: UserPoolMfaType): Self = this.set("MfaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMfaConfiguration: Self = this.set("MfaConfiguration", js.undefined)
    @scala.inline
    def setSmsMfaConfiguration(value: SmsMfaConfigType): Self = this.set("SmsMfaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsMfaConfiguration: Self = this.set("SmsMfaConfiguration", js.undefined)
    @scala.inline
    def setSoftwareTokenMfaConfiguration(value: SoftwareTokenMfaConfigType): Self = this.set("SoftwareTokenMfaConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareTokenMfaConfiguration: Self = this.set("SoftwareTokenMfaConfiguration", js.undefined)
  }
  
}

