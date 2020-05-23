package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableOrganizationAdminAccountRequest extends js.Object {
  /**
    * The AWS account ID for the account.
    */
  var adminAccountId: string = js.native
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
}

object EnableOrganizationAdminAccountRequest {
  @scala.inline
  def apply(adminAccountId: string, clientToken: string = null): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
}

