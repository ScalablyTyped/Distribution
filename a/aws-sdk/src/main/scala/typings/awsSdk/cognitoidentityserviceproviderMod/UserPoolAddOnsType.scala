package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAddOnsType extends js.Object {
  /**
    * The advanced security mode.
    */
  var AdvancedSecurityMode: AdvancedSecurityModeType = js.native
}

object UserPoolAddOnsType {
  @scala.inline
  def apply(AdvancedSecurityMode: AdvancedSecurityModeType): UserPoolAddOnsType = {
    val __obj = js.Dynamic.literal(AdvancedSecurityMode = AdvancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAddOnsType]
  }
  @scala.inline
  implicit class UserPoolAddOnsTypeOps[Self <: UserPoolAddOnsType] (val x: Self) extends AnyVal {
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
    def setAdvancedSecurityMode(value: AdvancedSecurityModeType): Self = this.set("AdvancedSecurityMode", value.asInstanceOf[js.Any])
  }
  
}

