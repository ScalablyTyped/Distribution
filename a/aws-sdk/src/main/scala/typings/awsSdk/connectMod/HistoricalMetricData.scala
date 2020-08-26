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
  def apply(): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricData]
  }
  @scala.inline
  implicit class HistoricalMetricDataOps[Self <: HistoricalMetricData] (val x: Self) extends AnyVal {
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
    def setMetric(value: HistoricalMetric): Self = this.set("Metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("Metric", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

