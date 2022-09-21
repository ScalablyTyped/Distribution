package typings.awsSdk.sagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeMetric extends StObject {
  
  /**
    * The dimension of metrics published.
    */
  var Dimension: js.UndefOr[typings.awsSdk.sagemakeredgeMod.Dimension] = js.undefined
  
  /**
    * Returns the name of the metric.
    */
  var MetricName: js.UndefOr[Metric] = js.undefined
  
  /**
    * Timestamp of when the metric was requested.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns the value of the metric.
    */
  var Value: js.UndefOr[typings.awsSdk.sagemakeredgeMod.Value] = js.undefined
}
object EdgeMetric {
  
  inline def apply(): EdgeMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeMetric]
  }
  
  extension [Self <: EdgeMetric](x: Self) {
    
    inline def setDimension(value: Dimension): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "Dimension", js.undefined)
    
    inline def setMetricName(value: Metric): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
