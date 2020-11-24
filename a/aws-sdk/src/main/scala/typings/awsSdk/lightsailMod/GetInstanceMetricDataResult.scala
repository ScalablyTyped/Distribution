package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceMetricDataResult extends js.Object {
  
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[InstanceMetricName] = js.native
}
object GetInstanceMetricDataResult {
  
  @scala.inline
  def apply(): GetInstanceMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceMetricDataResult]
  }
  
  @scala.inline
  implicit class GetInstanceMetricDataResultOps[Self <: GetInstanceMetricDataResult] (val x: Self) extends AnyVal {
    
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
    def setMetricDataVarargs(value: MetricDatapoint*): Self = this.set("metricData", js.Array(value :_*))
    
    @scala.inline
    def setMetricData(value: MetricDatapointList): Self = this.set("metricData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricData: Self = this.set("metricData", js.undefined)
    
    @scala.inline
    def setMetricName(value: InstanceMetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
  }
}
