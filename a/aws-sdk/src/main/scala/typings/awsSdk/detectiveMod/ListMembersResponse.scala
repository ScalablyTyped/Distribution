package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersResponse extends js.Object {
  /**
    * The list of member accounts in the behavior graph. The results include member accounts that did not pass verification and member accounts that have not yet accepted the invitation to the behavior graph. The results do not include member accounts that were removed from the behavior graph.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  /**
    * If there are more member accounts remaining in the results, then this is the pagination token to use to request the next page of member accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMembersResponse {
  @scala.inline
  def apply(): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersResponse]
  }
  @scala.inline
  implicit class ListMembersResponseOps[Self <: ListMembersResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

