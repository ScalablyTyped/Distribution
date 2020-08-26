package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetUserPoolMfaConfigRequest extends js.Object {
  /**
    * The MFA configuration. Valid values include:    OFF MFA will not be used for any users.    ON MFA is required for all users to sign in.    OPTIONAL MFA will be required only for individual users who have an MFA factor enabled.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The SMS text message MFA configuration.
    */
  var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.native
  /**
    * The software token MFA configuration.
    */
  var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object SetUserPoolMfaConfigRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserPoolMfaConfigRequest]
  }
  @scala.inline
  implicit class SetUserPoolMfaConfigRequestOps[Self <: SetUserPoolMfaConfigRequest] (val x: Self) extends AnyVal {
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

