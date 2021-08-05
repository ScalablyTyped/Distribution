package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesServiceStatistics extends StObject {
  
  var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
  
  /**
    * The response time histogram for the selected entities.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
  
  /**
    * The forecasted high and low fault count values.
    */
  var ServiceForecastStatistics: js.UndefOr[ForecastStatistics] = js.undefined
  
  var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
  
  /**
    * Timestamp of the window for which statistics are aggregated.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.xrayMod.Timestamp] = js.undefined
}
object TimeSeriesServiceStatistics {
  
  inline def apply(): TimeSeriesServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesServiceStatistics]
  }
  
  extension [Self <: TimeSeriesServiceStatistics](x: Self) {
    
    inline def setEdgeSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "EdgeSummaryStatistics", value.asInstanceOf[js.Any])
    
    inline def setEdgeSummaryStatisticsUndefined: Self = StObject.set(x, "EdgeSummaryStatistics", js.undefined)
    
    inline def setResponseTimeHistogram(value: Histogram): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
    
    inline def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
    
    inline def setServiceForecastStatistics(value: ForecastStatistics): Self = StObject.set(x, "ServiceForecastStatistics", value.asInstanceOf[js.Any])
    
    inline def setServiceForecastStatisticsUndefined: Self = StObject.set(x, "ServiceForecastStatistics", js.undefined)
    
    inline def setServiceSummaryStatistics(value: ServiceStatistics): Self = StObject.set(x, "ServiceSummaryStatistics", value.asInstanceOf[js.Any])
    
    inline def setServiceSummaryStatisticsUndefined: Self = StObject.set(x, "ServiceSummaryStatistics", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
