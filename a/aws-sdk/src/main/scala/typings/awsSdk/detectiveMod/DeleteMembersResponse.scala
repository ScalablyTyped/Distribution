package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersResponse extends js.Object {
  /**
    * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior graph.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
  /**
    * The list of member accounts that Detective was not able to delete from the behavior graph. For each member account, provides the reason that the deletion could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object DeleteMembersResponse {
  @scala.inline
  def apply(AccountIds: AccountIdList = null, UnprocessedAccounts: UnprocessedAccountList = null): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds.asInstanceOf[js.Any])
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersResponse]
  }
}

