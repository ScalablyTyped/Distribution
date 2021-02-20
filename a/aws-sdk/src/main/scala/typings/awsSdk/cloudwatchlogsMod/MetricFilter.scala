package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilter extends StObject {
  
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
  implicit class MetricFilterMutableBuilder[Self <: MetricFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNameUndefined: Self = StObject.set(x, "filterName", js.undefined)
    
    @scala.inline
    def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setMetricTransformations(value: MetricTransformations): Self = StObject.set(x, "metricTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTransformationsUndefined: Self = StObject.set(x, "metricTransformations", js.undefined)
    
    @scala.inline
    def setMetricTransformationsVarargs(value: MetricTransformation*): Self = StObject.set(x, "metricTransformations", js.Array(value :_*))
  }
}
