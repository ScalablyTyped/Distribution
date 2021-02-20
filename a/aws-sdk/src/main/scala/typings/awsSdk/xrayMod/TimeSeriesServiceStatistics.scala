package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesServiceStatistics extends StObject {
  
  var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
  
  /**
    * The response time histogram for the selected entities.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  
  /**
    * The forecasted high and low fault count values.
    */
  var ServiceForecastStatistics: js.UndefOr[ForecastStatistics] = js.native
  
  var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  
  /**
    * Timestamp of the window for which statistics are aggregated.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.xrayMod.Timestamp] = js.native
}
object TimeSeriesServiceStatistics {
  
  @scala.inline
  def apply(): TimeSeriesServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesServiceStatistics]
  }
  
  @scala.inline
  implicit class TimeSeriesServiceStatisticsMutableBuilder[Self <: TimeSeriesServiceStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "EdgeSummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSummaryStatisticsUndefined: Self = StObject.set(x, "EdgeSummaryStatistics", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogram(value: Histogram): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setServiceForecastStatistics(value: ForecastStatistics): Self = StObject.set(x, "ServiceForecastStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceForecastStatisticsUndefined: Self = StObject.set(x, "ServiceForecastStatistics", js.undefined)
    
    @scala.inline
    def setServiceSummaryStatistics(value: ServiceStatistics): Self = StObject.set(x, "ServiceSummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSummaryStatisticsUndefined: Self = StObject.set(x, "ServiceSummaryStatistics", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
