package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricDataResponse extends js.Object {
  /**
    * Information about the historical metrics. If no grouping is specified, a summary of metric data is returned.
    */
  var MetricResults: js.UndefOr[HistoricalMetricResults] = js.native
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object GetMetricDataResponse {
  @scala.inline
  def apply(MetricResults: HistoricalMetricResults = null, NextToken: NextToken = null): GetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    if (MetricResults != null) __obj.updateDynamic("MetricResults")(MetricResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricDataResponse]
  }
}

