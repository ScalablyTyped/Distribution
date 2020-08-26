package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecoverySettingType extends js.Object {
  /**
    * The list of RecoveryOptionTypes.
    */
  var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.native
}

object AccountRecoverySettingType {
  @scala.inline
  def apply(): AccountRecoverySettingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRecoverySettingType]
  }
  @scala.inline
  implicit class AccountRecoverySettingTypeOps[Self <: AccountRecoverySettingType] (val x: Self) extends AnyVal {
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
    def setRecoveryMechanismsVarargs(value: RecoveryOptionType*): Self = this.set("RecoveryMechanisms", js.Array(value :_*))
    @scala.inline
    def setRecoveryMechanisms(value: RecoveryMechanismsType): Self = this.set("RecoveryMechanisms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryMechanisms: Self = this.set("RecoveryMechanisms", js.undefined)
  }
  
}

