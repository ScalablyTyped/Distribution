package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilter extends js.Object {
  
  /**
    * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the metric filter.
    */
  var filterName: js.UndefOr[FilterName] = js.native
  
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  
  /**
    * The metric transformations.
    */
  var metricTransformations: js.UndefOr[MetricTransformations] = js.native
}
object MetricFilter {
  
  @scala.inline
  def apply(): MetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilter]
  }
  
  @scala.inline
  implicit class MetricFilterOps[Self <: MetricFilter] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setFilterName(value: FilterName): Self = this.set("filterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterName: Self = this.set("filterName", js.undefined)
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPattern: Self = this.set("filterPattern", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    
    @scala.inline
    def setMetricTransformationsVarargs(value: MetricTransformation*): Self = this.set("metricTransformations", js.Array(value :_*))
    
    @scala.inline
    def setMetricTransformations(value: MetricTransformations): Self = this.set("metricTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricTransformations: Self = this.set("metricTransformations", js.undefined)
  }
}
