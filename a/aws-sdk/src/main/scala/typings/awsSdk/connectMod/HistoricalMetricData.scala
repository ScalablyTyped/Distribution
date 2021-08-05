package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoricalMetricData extends StObject {
  
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[HistoricalMetric] = js.undefined
  
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typings.awsSdk.connectMod.Value] = js.undefined
}
object HistoricalMetricData {
  
  inline def apply(): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricData]
  }
  
  extension [Self <: HistoricalMetricData](x: Self) {
    
    inline def setMetric(value: HistoricalMetric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
