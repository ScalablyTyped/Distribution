package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesServiceStatistics extends js.Object {
  
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
  implicit class TimeSeriesServiceStatisticsOps[Self <: TimeSeriesServiceStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgeSummaryStatistics(value: EdgeStatistics): Self = this.set("EdgeSummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSummaryStatistics: Self = this.set("EdgeSummaryStatistics", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeHistogram(value: Histogram): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setServiceForecastStatistics(value: ForecastStatistics): Self = this.set("ServiceForecastStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceForecastStatistics: Self = this.set("ServiceForecastStatistics", js.undefined)
    
    @scala.inline
    def setServiceSummaryStatistics(value: ServiceStatistics): Self = this.set("ServiceSummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceSummaryStatistics: Self = this.set("ServiceSummaryStatistics", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
