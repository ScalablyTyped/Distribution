package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricFilter extends StObject {
  
  /**
    * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the metric filter.
    */
  var filterName: js.UndefOr[FilterName] = js.undefined
  
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The metric transformations.
    */
  var metricTransformations: js.UndefOr[MetricTransformations] = js.undefined
}
object MetricFilter {
  
  inline def apply(): MetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilter]
  }
  
  extension [Self <: MetricFilter](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    inline def setFilterNameUndefined: Self = StObject.set(x, "filterName", js.undefined)
    
    inline def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setMetricTransformations(value: MetricTransformations): Self = StObject.set(x, "metricTransformations", value.asInstanceOf[js.Any])
    
    inline def setMetricTransformationsUndefined: Self = StObject.set(x, "metricTransformations", js.undefined)
    
    inline def setMetricTransformationsVarargs(value: MetricTransformation*): Self = StObject.set(x, "metricTransformations", js.Array(value*))
  }
}
