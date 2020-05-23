package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableOrganizationAdminAccountRequest extends js.Object {
  /**
    * The AWS account ID of the delegated administrator account.
    */
  var adminAccountId: string = js.native
}

object DisableOrganizationAdminAccountRequest {
  @scala.inline
  def apply(adminAccountId: string): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
}

