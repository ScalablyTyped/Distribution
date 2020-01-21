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
  def apply(
    HITTypeId: EntityId = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    Status: ReviewableHITStatus = null
  ): ListReviewableHITsRequest = {
    val __obj = js.Dynamic.literal()
    if (HITTypeId != null) __obj.updateDynamic("HITTypeId")(HITTypeId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewableHITsRequest]
  }
}

