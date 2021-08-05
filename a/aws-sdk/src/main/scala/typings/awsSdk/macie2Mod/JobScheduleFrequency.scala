package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobScheduleFrequency extends StObject {
  
  /**
    * Specifies a daily recurrence pattern for running the job.
    */
  var dailySchedule: js.UndefOr[DailySchedule] = js.undefined
  
  /**
    * Specifies a monthly recurrence pattern for running the job.
    */
  var monthlySchedule: js.UndefOr[MonthlySchedule] = js.undefined
  
  /**
    * Specifies a weekly recurrence pattern for running the job.
    */
  var weeklySchedule: js.UndefOr[WeeklySchedule] = js.undefined
}
object JobScheduleFrequency {
  
  inline def apply(): JobScheduleFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScheduleFrequency]
  }
  
  extension [Self <: JobScheduleFrequency](x: Self) {
    
    inline def setDailySchedule(value: DailySchedule): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    inline def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    inline def setMonthlySchedule(value: MonthlySchedule): Self = StObject.set(x, "monthlySchedule", value.asInstanceOf[js.Any])
    
    inline def setMonthlyScheduleUndefined: Self = StObject.set(x, "monthlySchedule", js.undefined)
    
    inline def setWeeklySchedule(value: WeeklySchedule): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    inline def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
