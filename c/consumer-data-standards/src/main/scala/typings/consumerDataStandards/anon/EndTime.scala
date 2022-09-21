package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS_DAYS
import typings.consumerDataStandards.consumerDataStandardsStrings.FRIDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.MONDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.SATURDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.SUNDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.THURSDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.TUESDAY
import typings.consumerDataStandards.consumerDataStandardsStrings.WEDNESDAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTime
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The days that the rate applies to
    */
  var days: js.Array[
    SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | BUSINESS_DAYS
  ]
  
  /**
    * End of the period in HHMM format using 24 hour clock format
    */
  var endTime: String
  
  /**
    * Start of the period in HHMM format using 24 hour clock format
    */
  var startTime: String
}
object EndTime {
  
  inline def apply(
    days: js.Array[
      SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | BUSINESS_DAYS
    ],
    endTime: String,
    startTime: String
  ): EndTime = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
  
  extension [Self <: EndTime](x: Self) {
    
    inline def setDays(
      value: js.Array[
          SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | BUSINESS_DAYS
        ]
    ): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: (SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | BUSINESS_DAYS)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
