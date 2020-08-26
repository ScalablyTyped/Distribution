package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewPolicyResultsForHITRequest extends js.Object {
  /**
    * The unique identifier of the HIT to retrieve review results for.
    */
  var HITId: EntityId = js.native
  /**
    * Limit the number of results returned.
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to retrieve all data for both policy levels. For a list of all the described policies, see Review Policies. 
    */
  var PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.native
  /**
    *  Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their outcomes. 
    */
  var RetrieveActions: js.UndefOr[Boolean] = js.native
  /**
    *  Specify if the operation should retrieve a list of the results computed by the Review Policies. 
    */
  var RetrieveResults: js.UndefOr[Boolean] = js.native
}

object ListReviewPolicyResultsForHITRequest {
  @scala.inline
  def apply(HITId: EntityId): ListReviewPolicyResultsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewPolicyResultsForHITRequest]
  }
  @scala.inline
  implicit class ListReviewPolicyResultsForHITRequestOps[Self <: ListReviewPolicyResultsForHITRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPolicyLevelsVarargs(value: ReviewPolicyLevel*): Self = this.set("PolicyLevels", js.Array(value :_*))
    @scala.inline
    def setPolicyLevels(value: ReviewPolicyLevelList): Self = this.set("PolicyLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyLevels: Self = this.set("PolicyLevels", js.undefined)
    @scala.inline
    def setRetrieveActions(value: Boolean): Self = this.set("RetrieveActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrieveActions: Self = this.set("RetrieveActions", js.undefined)
    @scala.inline
    def setRetrieveResults(value: Boolean): Self = this.set("RetrieveResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrieveResults: Self = this.set("RetrieveResults", js.undefined)
  }
  
}

