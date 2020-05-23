package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableOrganizationAdminAccountRequest extends js.Object {
  /**
    * The AWS Account ID for the organization account to be enabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String = js.native
}

object EnableOrganizationAdminAccountRequest {
  @scala.inline
  def apply(AdminAccountId: String): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
}

