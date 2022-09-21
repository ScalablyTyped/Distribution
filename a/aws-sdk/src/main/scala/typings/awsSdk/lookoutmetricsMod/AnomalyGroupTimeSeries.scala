package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyGroupTimeSeries extends StObject {
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: UUID
  
  /**
    * The ID of the metric.
    */
  var TimeSeriesId: js.UndefOr[typings.awsSdk.lookoutmetricsMod.TimeSeriesId] = js.undefined
}
object AnomalyGroupTimeSeries {
  
  inline def apply(AnomalyGroupId: UUID): AnomalyGroupTimeSeries = {
    val __obj = js.Dynamic.literal(AnomalyGroupId = AnomalyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyGroupTimeSeries]
  }
  
  extension [Self <: AnomalyGroupTimeSeries](x: Self) {
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesId(value: TimeSeriesId): Self = StObject.set(x, "TimeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "TimeSeriesId", js.undefined)
  }
}
