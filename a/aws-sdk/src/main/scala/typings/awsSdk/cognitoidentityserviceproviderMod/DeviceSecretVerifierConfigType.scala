package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSecretVerifierConfigType extends js.Object {
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.native
  /**
    * The salt.
    */
  var Salt: js.UndefOr[StringType] = js.native
}

object DeviceSecretVerifierConfigType {
  @scala.inline
  def apply(): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
  @scala.inline
  implicit class DeviceSecretVerifierConfigTypeOps[Self <: DeviceSecretVerifierConfigType] (val x: Self) extends AnyVal {
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
    def setPasswordVerifier(value: StringType): Self = this.set("PasswordVerifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordVerifier: Self = this.set("PasswordVerifier", js.undefined)
    @scala.inline
    def setSalt(value: StringType): Self = this.set("Salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("Salt", js.undefined)
  }
  
}

