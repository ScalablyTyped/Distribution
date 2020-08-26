package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * The member account details that Detective is returning in response to the request.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  /**
    * The requested member accounts for which Detective was unable to return member details. For each account, provides the reason why the request could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembersResponse]
  }
  @scala.inline
  implicit class GetMembersResponseOps[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
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
    def setMemberDetailsVarargs(value: MemberDetail*): Self = this.set("MemberDetails", js.Array(value :_*))
    @scala.inline
    def setMemberDetails(value: MemberDetailList): Self = this.set("MemberDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberDetails: Self = this.set("MemberDetails", js.undefined)
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccountList): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedAccounts: Self = this.set("UnprocessedAccounts", js.undefined)
  }
  
}

