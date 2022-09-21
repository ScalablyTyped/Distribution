package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyGroupTimeSeriesFeedback extends StObject {
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: UUID
  
  /**
    * Feedback on whether the metric is a legitimate anomaly.
    */
  var IsAnomaly: Boolean
  
  /**
    * The ID of the metric.
    */
  var TimeSeriesId: typings.awsSdk.lookoutmetricsMod.TimeSeriesId
}
object AnomalyGroupTimeSeriesFeedback {
  
  inline def apply(AnomalyGroupId: UUID, IsAnomaly: Boolean, TimeSeriesId: TimeSeriesId): AnomalyGroupTimeSeriesFeedback = {
    val __obj = js.Dynamic.literal(AnomalyGroupId = AnomalyGroupId.asInstanceOf[js.Any], IsAnomaly = IsAnomaly.asInstanceOf[js.Any], TimeSeriesId = TimeSeriesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyGroupTimeSeriesFeedback]
  }
  
  extension [Self <: AnomalyGroupTimeSeriesFeedback](x: Self) {
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setIsAnomaly(value: Boolean): Self = StObject.set(x, "IsAnomaly", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesId(value: TimeSeriesId): Self = StObject.set(x, "TimeSeriesId", value.asInstanceOf[js.Any])
  }
}
