package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePendingAggregationRequestsResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a PendingAggregationRequests object.
    */
  var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.native
}

object DescribePendingAggregationRequestsResponse {
  @scala.inline
  def apply(NextToken: String = null, PendingAggregationRequests: PendingAggregationRequestList = null): DescribePendingAggregationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PendingAggregationRequests != null) __obj.updateDynamic("PendingAggregationRequests")(PendingAggregationRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePendingAggregationRequestsResponse]
  }
}

