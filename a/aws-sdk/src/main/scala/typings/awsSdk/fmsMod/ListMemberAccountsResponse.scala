package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAccountsResponse extends js.Object {
  /**
    * An array of account IDs.
    */
  var MemberAccounts: js.UndefOr[typings.awsSdk.fmsMod.MemberAccounts] = js.native
  /**
    * If you have more member account IDs than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more IDs, submit another ListMemberAccounts request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMemberAccountsResponse {
  @scala.inline
  def apply(): ListMemberAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsResponse]
  }
  @scala.inline
  implicit class ListMemberAccountsResponseOps[Self <: ListMemberAccountsResponse] (val x: Self) extends AnyVal {
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
    def setMemberAccountsVarargs(value: AWSAccountId*): Self = this.set("MemberAccounts", js.Array(value :_*))
    @scala.inline
    def setMemberAccounts(value: MemberAccounts): Self = this.set("MemberAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccounts: Self = this.set("MemberAccounts", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

