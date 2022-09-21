package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampMetricValuePair extends StObject {
  
  /**
    * Value of the anomalous metric data point at respective Timestamp.
    */
  var MetricValue: js.UndefOr[typings.awsSdk.devopsguruMod.MetricValue] = js.undefined
  
  /**
    * A Timestamp that specifies the time the event occurred. 
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object TimestampMetricValuePair {
  
  inline def apply(): TimestampMetricValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampMetricValuePair]
  }
  
  extension [Self <: TimestampMetricValuePair](x: Self) {
    
    inline def setMetricValue(value: MetricValue): Self = StObject.set(x, "MetricValue", value.asInstanceOf[js.Any])
    
    inline def setMetricValueUndefined: Self = StObject.set(x, "MetricValue", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
