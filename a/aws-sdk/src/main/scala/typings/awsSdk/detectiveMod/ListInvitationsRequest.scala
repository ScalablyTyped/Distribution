package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvitationsRequest extends js.Object {
  /**
    * The maximum number of behavior graph invitations to return in the response. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.native
  /**
    * For requests to retrieve the next page of results, the pagination token that was returned with the previous page of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInvitationsRequest {
  @scala.inline
  def apply(): ListInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsRequest]
  }
  @scala.inline
  implicit class ListInvitationsRequestOps[Self <: ListInvitationsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MemberResultsLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

