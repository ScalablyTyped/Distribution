package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectedMetric extends js.Object {
  
  /**
    * The name of the projected utilization metric.
    */
  var name: js.UndefOr[MetricName] = js.native
  
  /**
    * The time stamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.native
  
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.native
}
object ProjectedMetric {
  
  @scala.inline
  def apply(): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedMetric]
  }
  
  @scala.inline
  implicit class ProjectedMetricOps[Self <: ProjectedMetric] (val x: Self) extends AnyVal {
    
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
    def setTimestampsVarargs(value: Timestamp*): Self = this.set("timestamps", js.Array(value :_*))
    
    @scala.inline
    def setTimestamps(value: Timestamps): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: MetricValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: MetricValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
