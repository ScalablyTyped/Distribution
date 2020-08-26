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
  def apply(): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
  @scala.inline
  implicit class GetCurrentMetricDataResponseOps[Self <: GetCurrentMetricDataResponse] (val x: Self) extends AnyVal {
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
    def setDataSnapshotTime(value: timestamp): Self = this.set("DataSnapshotTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSnapshotTime: Self = this.set("DataSnapshotTime", js.undefined)
    @scala.inline
    def setMetricResultsVarargs(value: CurrentMetricResult*): Self = this.set("MetricResults", js.Array(value :_*))
    @scala.inline
    def setMetricResults(value: CurrentMetricResults): Self = this.set("MetricResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricResults: Self = this.set("MetricResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

