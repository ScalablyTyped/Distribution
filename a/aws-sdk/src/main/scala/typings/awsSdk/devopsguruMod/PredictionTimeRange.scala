package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictionTimeRange extends StObject {
  
  /**
    *  The time when the behavior in a proactive insight is expected to end. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time range during which a metric limit is expected to be exceeded. This applies to proactive insights only. 
    */
  var StartTime: js.Date
}
object PredictionTimeRange {
  
  inline def apply(StartTime: js.Date): PredictionTimeRange = {
    val __obj = js.Dynamic.literal(StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictionTimeRange]
  }
  
  extension [Self <: PredictionTimeRange](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
