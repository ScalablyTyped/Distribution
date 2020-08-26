package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersResponse extends js.Object {
  /**
    * The set of member account invitation requests that Detective was able to process. This includes accounts that are being verified, that failed verification, and that passed verification and are being sent an invitation.
    */
  var Members: js.UndefOr[MemberDetailList] = js.native
  /**
    * The list of accounts for which Detective was unable to process the invitation request. For each account, the list provides the reason why the request could not be processed. The list includes accounts that are already member accounts in the behavior graph.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object CreateMembersResponse {
  @scala.inline
  def apply(): CreateMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMembersResponse]
  }
  @scala.inline
  implicit class CreateMembersResponseOps[Self <: CreateMembersResponse] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: MemberDetail*): Self = this.set("Members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: MemberDetailList): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("Members", js.undefined)
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("UnprocessedAccounts", js.undefined)
  }
  
}

