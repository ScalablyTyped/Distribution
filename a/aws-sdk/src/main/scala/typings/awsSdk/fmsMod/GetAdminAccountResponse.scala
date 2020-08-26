package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAdminAccountResponse extends js.Object {
  /**
    * The AWS account that is set as the AWS Firewall Manager administrator.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The status of the AWS account that you set as the AWS Firewall Manager administrator.
    */
  var RoleStatus: js.UndefOr[AccountRoleStatus] = js.native
}

object GetAdminAccountResponse {
  @scala.inline
  def apply(): GetAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdminAccountResponse]
  }
  @scala.inline
  implicit class GetAdminAccountResponseOps[Self <: GetAdminAccountResponse] (val x: Self) extends AnyVal {
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
    def setAdminAccount(value: AWSAccountId): Self = this.set("AdminAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminAccount: Self = this.set("AdminAccount", js.undefined)
    @scala.inline
    def setRoleStatus(value: AccountRoleStatus): Self = this.set("RoleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleStatus: Self = this.set("RoleStatus", js.undefined)
  }
  
}

