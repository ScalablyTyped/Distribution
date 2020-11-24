package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricToRetain extends js.Object {
  
  /**
    * What is measured by the behavior.
    */
  var metric: BehaviorMetric = js.native
  
  /**
    * The dimension of a metric.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.native
}
object MetricToRetain {
  
  @scala.inline
  def apply(metric: BehaviorMetric): MetricToRetain = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricToRetain]
  }
  
  @scala.inline
  implicit class MetricToRetainOps[Self <: MetricToRetain] (val x: Self) extends AnyVal {
    
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
    def setMetric(value: BehaviorMetric): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimension(value: MetricDimension): Self = this.set("metricDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricDimension: Self = this.set("metricDimension", js.undefined)
  }
}
