package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsResponse extends js.Object {
  /**
    * An array of objects, one for each account whose invitation hasn't been deleted. Each object identifies the account and explains why the request hasn't been processed for that account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.native
}

object DeleteInvitationsResponse {
  @scala.inline
  def apply(): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
  @scala.inline
  implicit class DeleteInvitationsResponseOps[Self <: DeleteInvitationsResponse] (val x: Self) extends AnyVal {
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
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("unprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: listOfUnprocessedAccount): Self = this.set("unprocessedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("unprocessedAccounts", js.undefined)
  }
  
}

