package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoursOfOperationConfig extends StObject {
  
  /**
    * The day that the hours of operation applies to.
    */
  var Day: HoursOfOperationDays
  
  /**
    * The end time that your contact center closes.
    */
  var EndTime: HoursOfOperationTimeSlice
  
  /**
    * The start time that your contact center opens.
    */
  var StartTime: HoursOfOperationTimeSlice
}
object HoursOfOperationConfig {
  
  inline def apply(
    Day: HoursOfOperationDays,
    EndTime: HoursOfOperationTimeSlice,
    StartTime: HoursOfOperationTimeSlice
  ): HoursOfOperationConfig = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoursOfOperationConfig]
  }
  
  extension [Self <: HoursOfOperationConfig](x: Self) {
    
    inline def setDay(value: HoursOfOperationDays): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: HoursOfOperationTimeSlice): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: HoursOfOperationTimeSlice): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
