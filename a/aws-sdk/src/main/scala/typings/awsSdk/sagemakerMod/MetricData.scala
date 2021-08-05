package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricData extends StObject {
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.undefined
  
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sagemakerMod.Timestamp] = js.undefined
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.undefined
}
object MetricData {
  
  inline def apply(): MetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricData]
  }
  
  extension [Self <: MetricData](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setValue(value: Float): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
