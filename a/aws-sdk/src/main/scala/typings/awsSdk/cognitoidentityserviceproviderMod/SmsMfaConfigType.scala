package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsMfaConfigType extends js.Object {
  /**
    * The SMS authentication message that will be sent to users with the code they need to sign in. The message must contain the ‘{####}’ placeholder, which will be replaced with the code. If the message is not included, and default message will be used.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
}

object SmsMfaConfigType {
  @scala.inline
  def apply(): SmsMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsMfaConfigType]
  }
  @scala.inline
  implicit class SmsMfaConfigTypeOps[Self <: SmsMfaConfigType] (val x: Self) extends AnyVal {
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
    def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = this.set("SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsAuthenticationMessage: Self = this.set("SmsAuthenticationMessage", js.undefined)
    @scala.inline
    def setSmsConfiguration(value: SmsConfigurationType): Self = this.set("SmsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsConfiguration: Self = this.set("SmsConfiguration", js.undefined)
  }
  
}

