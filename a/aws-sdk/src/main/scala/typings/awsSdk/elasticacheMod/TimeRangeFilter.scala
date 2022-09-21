package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeFilter extends StObject {
  
  /**
    * The end time of the time range filter
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start time of the time range filter
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object TimeRangeFilter {
  
  inline def apply(): TimeRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRangeFilter]
  }
  
  extension [Self <: TimeRangeFilter](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
