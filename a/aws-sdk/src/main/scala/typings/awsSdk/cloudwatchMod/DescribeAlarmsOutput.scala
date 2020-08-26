package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsOutput extends js.Object {
  /**
    * The information about any composite alarms returned by the operation.
    */
  var CompositeAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.CompositeAlarms] = js.native
  /**
    * The information about any metric alarms returned by the operation.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAlarmsOutput {
  @scala.inline
  def apply(): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
  @scala.inline
  implicit class DescribeAlarmsOutputOps[Self <: DescribeAlarmsOutput] (val x: Self) extends AnyVal {
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
    def setCompositeAlarmsVarargs(value: CompositeAlarm*): Self = this.set("CompositeAlarms", js.Array(value :_*))
    @scala.inline
    def setCompositeAlarms(value: CompositeAlarms): Self = this.set("CompositeAlarms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositeAlarms: Self = this.set("CompositeAlarms", js.undefined)
    @scala.inline
    def setMetricAlarmsVarargs(value: MetricAlarm*): Self = this.set("MetricAlarms", js.Array(value :_*))
    @scala.inline
    def setMetricAlarms(value: MetricAlarms): Self = this.set("MetricAlarms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricAlarms: Self = this.set("MetricAlarms", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

