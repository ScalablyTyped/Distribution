package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricData extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.native
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sagemakerMod.Timestamp] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.native
}

object MetricData {
  @scala.inline
  def apply(): MetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricData]
  }
  @scala.inline
  implicit class MetricDataOps[Self <: MetricData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
    @scala.inline
    def setValue(value: Float): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

