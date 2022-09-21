package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var days: Weekdays
  
  /**
    * The end of the time period per day for which the tariff applies.  If absent assumes end of day (ie. one second before midnight)
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The beginning of the time period per day for which the tariff applies.  If absent assumes start of day (ie. midnight)
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object Days {
  
  inline def apply(days: Weekdays): Days = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  extension [Self <: Days](x: Self) {
    
    inline def setDays(value: Weekdays): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
