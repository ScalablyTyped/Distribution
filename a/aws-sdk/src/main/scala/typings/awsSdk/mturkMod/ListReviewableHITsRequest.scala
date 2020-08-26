package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewableHITsRequest extends js.Object {
  /**
    *  The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are considered 
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  Can be either Reviewable or Reviewing. Reviewable is the default value. 
    */
  var Status: js.UndefOr[ReviewableHITStatus] = js.native
}

object ListReviewableHITsRequest {
  @scala.inline
  def apply(): ListReviewableHITsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewableHITsRequest]
  }
  @scala.inline
  implicit class ListReviewableHITsRequestOps[Self <: ListReviewableHITsRequest] (val x: Self) extends AnyVal {
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
    def setHITTypeId(value: EntityId): Self = this.set("HITTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITTypeId: Self = this.set("HITTypeId", js.undefined)
    @scala.inline
    def setMaxResults(value: ResultSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatus(value: ReviewableHITStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

