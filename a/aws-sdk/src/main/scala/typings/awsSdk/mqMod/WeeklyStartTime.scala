package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeeklyStartTime extends StObject {
  
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.mqMod.DayOfWeek] = js.undefined
  
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: js.UndefOr[string] = js.undefined
  
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[string] = js.undefined
}
object WeeklyStartTime {
  
  @scala.inline
  def apply(): WeeklyStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyStartTime]
  }
  
  @scala.inline
  implicit class WeeklyStartTimeMutableBuilder[Self <: WeeklyStartTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: string): Self = StObject.set(x, "TimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOfDayUndefined: Self = StObject.set(x, "TimeOfDay", js.undefined)
    
    @scala.inline
    def setTimeZone(value: string): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
