package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDatum extends StObject {
  
  /**
    * The time the metric value was reported.
    */
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The value reported for the metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object MetricDatum {
  
  inline def apply(): MetricDatum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDatum]
  }
  
  extension [Self <: MetricDatum](x: Self) {
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
