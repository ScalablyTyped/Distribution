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
}

