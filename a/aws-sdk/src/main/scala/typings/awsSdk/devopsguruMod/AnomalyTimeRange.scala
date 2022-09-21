package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyTimeRange extends StObject {
  
  /**
    *  The time when the anomalous behavior ended. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time when the anomalous behavior started. 
    */
  var StartTime: js.Date
}
object AnomalyTimeRange {
  
  inline def apply(StartTime: js.Date): AnomalyTimeRange = {
    val __obj = js.Dynamic.literal(StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyTimeRange]
  }
  
  extension [Self <: AnomalyTimeRange](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
