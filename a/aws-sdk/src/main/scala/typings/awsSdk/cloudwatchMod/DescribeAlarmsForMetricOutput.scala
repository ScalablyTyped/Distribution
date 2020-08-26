package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsForMetricOutput extends js.Object {
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.native
}

object DescribeAlarmsForMetricOutput {
  @scala.inline
  def apply(): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
  @scala.inline
  implicit class DescribeAlarmsForMetricOutputOps[Self <: DescribeAlarmsForMetricOutput] (val x: Self) extends AnyVal {
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
    def setMetricAlarmsVarargs(value: MetricAlarm*): Self = this.set("MetricAlarms", js.Array(value :_*))
    @scala.inline
    def setMetricAlarms(value: MetricAlarms): Self = this.set("MetricAlarms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricAlarms: Self = this.set("MetricAlarms", js.undefined)
  }
  
}

