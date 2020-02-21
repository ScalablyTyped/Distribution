package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsRequest extends js.Object {
  /**
    * The list of account IDs for the accounts from which to decline the invitations to Security Hub.
    */
  var AccountIds: AccountIdList = js.native
}

object DeclineInvitationsRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
}

