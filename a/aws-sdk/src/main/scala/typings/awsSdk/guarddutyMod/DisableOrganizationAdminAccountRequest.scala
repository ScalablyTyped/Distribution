package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableOrganizationAdminAccountRequest extends js.Object {
  /**
    * The AWS Account ID for the organizations account to be disabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String = js.native
}

object DisableOrganizationAdminAccountRequest {
  @scala.inline
  def apply(AdminAccountId: String): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  @scala.inline
  implicit class DisableOrganizationAdminAccountRequestOps[Self <: DisableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminAccountId(value: String): Self = this.set("AdminAccountId", value.asInstanceOf[js.Any])
  }
  
}

