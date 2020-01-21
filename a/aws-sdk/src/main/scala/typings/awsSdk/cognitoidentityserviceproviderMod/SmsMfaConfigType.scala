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
  def apply(
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null
  ): SmsMfaConfigType = {
    val __obj = js.Dynamic.literal()
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage.asInstanceOf[js.Any])
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMfaConfigType]
  }
}

