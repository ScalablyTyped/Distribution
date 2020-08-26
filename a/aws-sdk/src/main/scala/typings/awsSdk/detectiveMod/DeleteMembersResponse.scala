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
  def apply(): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMembersResponse]
  }
  @scala.inline
  implicit class DeleteMembersResponseOps[Self <: DeleteMembersResponse] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("UnprocessedAccounts", js.undefined)
  }
  
}

