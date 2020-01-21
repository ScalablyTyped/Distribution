package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateServiceRoleFromAccountResponse extends js.Object {
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}

object DisassociateServiceRoleFromAccountResponse {
  @scala.inline
  def apply(DisassociatedAt: string = null): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (DisassociatedAt != null) __obj.updateDynamic("DisassociatedAt")(DisassociatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
}

