package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectedMetric extends StObject {
  
  /**
    * The name of the projected utilization metric.
    */
  var name: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The time stamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.undefined
  
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.undefined
}
object ProjectedMetric {
  
  inline def apply(): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedMetric]
  }
  
  extension [Self <: ProjectedMetric](x: Self) {
    
    inline def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimestamps(value: Timestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: Timestamp*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
    
    inline def setValues(value: MetricValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: MetricValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
