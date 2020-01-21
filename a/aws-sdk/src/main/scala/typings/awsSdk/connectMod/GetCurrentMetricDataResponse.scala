package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentMetricDataResponse extends js.Object {
  /**
    * The time at which the metrics were retrieved and cached for pagination.
    */
  var DataSnapshotTime: js.UndefOr[timestamp] = js.native
  /**
    * Information about the real-time metrics.
    */
  var MetricResults: js.UndefOr[CurrentMetricResults] = js.native
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object GetCurrentMetricDataResponse {
  @scala.inline
  def apply(
    DataSnapshotTime: timestamp = null,
    MetricResults: CurrentMetricResults = null,
    NextToken: NextToken = null
  ): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSnapshotTime != null) __obj.updateDynamic("DataSnapshotTime")(DataSnapshotTime.asInstanceOf[js.Any])
    if (MetricResults != null) __obj.updateDynamic("MetricResults")(MetricResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
}

