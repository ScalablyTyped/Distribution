package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesFeedback extends StObject {
  
  /**
    * Feedback on whether the metric is a legitimate anomaly.
    */
  var IsAnomaly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the metric.
    */
  var TimeSeriesId: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TimeSeriesId] = js.undefined
}
object TimeSeriesFeedback {
  
  inline def apply(): TimeSeriesFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesFeedback]
  }
  
  extension [Self <: TimeSeriesFeedback](x: Self) {
    
    inline def setIsAnomaly(value: Boolean): Self = StObject.set(x, "IsAnomaly", value.asInstanceOf[js.Any])
    
    inline def setIsAnomalyUndefined: Self = StObject.set(x, "IsAnomaly", js.undefined)
    
    inline def setTimeSeriesId(value: TimeSeriesId): Self = StObject.set(x, "TimeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "TimeSeriesId", js.undefined)
  }
}
