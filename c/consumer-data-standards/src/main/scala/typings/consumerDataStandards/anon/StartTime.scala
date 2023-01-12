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

trait StartTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The days that the rate applies to
    */
  var days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]
  
  /**
    * End of the period
    */
  var endTime: String
  
  /**
    * Start of the period
    */
  var startTime: String
}
object StartTime {
  
  inline def apply(
    days: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS],
    endTime: String,
    startTime: String
  ): StartTime = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTime] (val x: Self) extends AnyVal {
    
    inline def setDays(value: js.Array[SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: (SUN | MON | TUE | WED | THU | FRI | SAT | PUBLIC_HOLIDAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
