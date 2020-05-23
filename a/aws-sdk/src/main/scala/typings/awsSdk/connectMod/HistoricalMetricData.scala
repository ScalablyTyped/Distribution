package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetricData extends js.Object {
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[HistoricalMetric] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typings.awsSdk.connectMod.Value] = js.native
}

object HistoricalMetricData {
  @scala.inline
  def apply(Metric: HistoricalMetric = null, Value: js.UndefOr[Value] = js.undefined): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoricalMetricData]
  }
}

