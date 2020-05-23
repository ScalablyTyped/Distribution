package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePendingAggregationRequestsRequest extends js.Object {
  /**
    * The maximum number of evaluation results returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribePendingAggregationRequestsRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.undefined,
    NextToken: String = null
  ): DescribePendingAggregationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePendingAggregationRequestsRequest]
  }
}

