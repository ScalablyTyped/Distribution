package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesResponse extends js.Object {
  /**
    * If you have more PolicySummary objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicySummary objects, submit another ListPolicies request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of PolicySummary objects.
    */
  var PolicyList: js.UndefOr[PolicySummaryList] = js.native
}

object ListPoliciesResponse {
  @scala.inline
  def apply(): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesResponse]
  }
  @scala.inline
  implicit class ListPoliciesResponseOps[Self <: ListPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPolicyListVarargs(value: PolicySummary*): Self = this.set("PolicyList", js.Array(value :_*))
    @scala.inline
    def setPolicyList(value: PolicySummaryList): Self = this.set("PolicyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyList: Self = this.set("PolicyList", js.undefined)
  }
  
}

