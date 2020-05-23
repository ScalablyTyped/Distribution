package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetricData extends js.Object {
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[CurrentMetric] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typings.awsSdk.connectMod.Value] = js.native
}

object CurrentMetricData {
  @scala.inline
  def apply(Metric: CurrentMetric = null, Value: js.UndefOr[Value] = js.undefined): CurrentMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMetricData]
  }
}

