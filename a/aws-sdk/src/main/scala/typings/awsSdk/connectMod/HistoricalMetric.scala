package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[HistoricalMetricName] = js.native
  /**
    * The statistic for the metric.
    */
  var Statistic: js.UndefOr[typings.awsSdk.connectMod.Statistic] = js.native
  /**
    * The threshold for the metric, used with service level metrics.
    */
  var Threshold: js.UndefOr[typings.awsSdk.connectMod.Threshold] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.connectMod.Unit] = js.native
}

object HistoricalMetric {
  @scala.inline
  def apply(
    Name: HistoricalMetricName = null,
    Statistic: Statistic = null,
    Threshold: Threshold = null,
    Unit: Unit = null
  ): HistoricalMetric = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Threshold != null) __obj.updateDynamic("Threshold")(Threshold.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoricalMetric]
  }
}

