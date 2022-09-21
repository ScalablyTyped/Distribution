package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightTimeRange extends StObject {
  
  /**
    *  The time when the behavior described in an insight ended. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time when the behavior described in an insight started. 
    */
  var StartTime: js.Date
}
object InsightTimeRange {
  
  inline def apply(StartTime: js.Date): InsightTimeRange = {
    val __obj = js.Dynamic.literal(StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightTimeRange]
  }
  
  extension [Self <: InsightTimeRange](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
