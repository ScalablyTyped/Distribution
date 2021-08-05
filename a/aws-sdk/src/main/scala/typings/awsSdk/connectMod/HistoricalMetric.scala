package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoricalMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[HistoricalMetricName] = js.undefined
  
  /**
    * The statistic for the metric.
    */
  var Statistic: js.UndefOr[typings.awsSdk.connectMod.Statistic] = js.undefined
  
  /**
    * The threshold for the metric, used with service level metrics.
    */
  var Threshold: js.UndefOr[typings.awsSdk.connectMod.Threshold] = js.undefined
  
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.connectMod.Unit] = js.undefined
}
object HistoricalMetric {
  
  inline def apply(): HistoricalMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetric]
  }
  
  extension [Self <: HistoricalMetric](x: Self) {
    
    inline def setName(value: HistoricalMetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    inline def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
