package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.FRI
import typings.consumerDataStandards.consumerDataStandardsStrings.MON
import typings.consumerDataStandards.consumerDataStandardsStrings.PUBLIC_HOLIDAYS
import typings.consumerDataStandards.consumerDataStandardsStrings.SAT
import typings.consumerDataStandards.consumerDataStandardsStrings.SUN
import typings.consumerDataStandards.consumerDataStandardsStrings.THU
import typings.consumerDataStandards.consumerDataStandardsStrings.TUE
import typings.consumerDataStandards.consumerDataStandardsStrings.WED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The days that the tariff applies to. At least one entry required
    */
  var days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]
  
  /**
    * The end of the time period per day for which the tariff applies.  If absent assumes end of day (ie. one second before midnight)
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The beginning of the time period per day for which the tariff applies.  If absent assumes start of day (ie. midnight)
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object EndTime {
  
  inline def apply(days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): EndTime = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
  
  extension [Self <: EndTime](x: Self) {
    
    inline def setDays(value: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: (SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
