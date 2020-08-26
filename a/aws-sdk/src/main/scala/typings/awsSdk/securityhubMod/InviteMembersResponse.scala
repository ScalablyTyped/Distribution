package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersResponse extends js.Object {
  /**
    * The list of AWS accounts that could not be processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object InviteMembersResponse {
  @scala.inline
  def apply(): InviteMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteMembersResponse]
  }
  @scala.inline
  implicit class InviteMembersResponseOps[Self <: InviteMembersResponse] (val x: Self) extends AnyVal {
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
    def setUnprocessedAccountsVarargs(value: Result*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: ResultList): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("UnprocessedAccounts", js.undefined)
  }
  
}

