package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationMetric extends js.Object {
  /**
    * The name of the utilization metric.  Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  /**
    * The statistic of the utilization metric.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}

object UtilizationMetric {
  @scala.inline
  def apply(): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationMetric]
  }
  @scala.inline
  implicit class UtilizationMetricOps[Self <: UtilizationMetric] (val x: Self) extends AnyVal {
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
    def setName(value: MetricName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatistic(value: MetricStatistic): Self = this.set("statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistic: Self = this.set("statistic", js.undefined)
    @scala.inline
    def setValue(value: MetricValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

