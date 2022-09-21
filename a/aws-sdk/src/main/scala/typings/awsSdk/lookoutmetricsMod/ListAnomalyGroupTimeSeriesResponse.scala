package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupTimeSeriesResponse extends StObject {
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of the measure field.
    */
  var MetricName: js.UndefOr[typings.awsSdk.lookoutmetricsMod.MetricName] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutmetricsMod.NextToken] = js.undefined
  
  /**
    * A list of anomalous metrics.
    */
  var TimeSeriesList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TimeSeriesList] = js.undefined
  
  /**
    * Timestamps for the anomalous metrics.
    */
  var TimestampList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TimestampList] = js.undefined
}
object ListAnomalyGroupTimeSeriesResponse {
  
  inline def apply(): ListAnomalyGroupTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomalyGroupTimeSeriesResponse]
  }
  
  extension [Self <: ListAnomalyGroupTimeSeriesResponse](x: Self) {
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupIdUndefined: Self = StObject.set(x, "AnomalyGroupId", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTimeSeriesList(value: TimeSeriesList): Self = StObject.set(x, "TimeSeriesList", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesListUndefined: Self = StObject.set(x, "TimeSeriesList", js.undefined)
    
    inline def setTimeSeriesListVarargs(value: TimeSeries*): Self = StObject.set(x, "TimeSeriesList", js.Array(value*))
    
    inline def setTimestampList(value: TimestampList): Self = StObject.set(x, "TimestampList", value.asInstanceOf[js.Any])
    
    inline def setTimestampListUndefined: Self = StObject.set(x, "TimestampList", js.undefined)
    
    inline def setTimestampListVarargs(value: TimestampString*): Self = StObject.set(x, "TimestampList", js.Array(value*))
  }
}
