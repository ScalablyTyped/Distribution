package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsRequest extends js.Object {
  /**
    * The list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: AccountIdList = js.native
}

object DeleteInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
}

