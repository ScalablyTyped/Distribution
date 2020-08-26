package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleInfo extends js.Object {
  /**
    * The identifier of the AWS account assigned to the user.
    */
  var accountId: js.UndefOr[AccountIdType] = js.native
  /**
    * The friendly name of the role that is assigned to the user.
    */
  var roleName: js.UndefOr[RoleNameType] = js.native
}

object RoleInfo {
  @scala.inline
  def apply(): RoleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleInfo]
  }
  @scala.inline
  implicit class RoleInfoOps[Self <: RoleInfo] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountIdType): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setRoleName(value: RoleNameType): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
  }
  
}

