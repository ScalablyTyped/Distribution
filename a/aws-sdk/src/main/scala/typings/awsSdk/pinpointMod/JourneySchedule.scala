package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneySchedule extends StObject {
  
  /**
    * The scheduled time, in ISO 8601 format, when the journey ended or will end.
    */
  var EndTime: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The scheduled time, in ISO 8601 format, when the journey began or will begin.
    */
  var StartTime: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The starting UTC offset for the journey schedule, if the value of the journey's LocalTime property is true. Valid values are: UTC,
    UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
    UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09, UTC+09:30,
    UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02,
    UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
    UTC-09:30, UTC-10, and UTC-11.
    */
  var Timezone: js.UndefOr[string] = js.undefined
}
object JourneySchedule {
  
  @scala.inline
  def apply(): JourneySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneySchedule]
  }
  
  @scala.inline
  implicit class JourneyScheduleMutableBuilder[Self <: JourneySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: timestampIso8601): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: timestampIso8601): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: string): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
