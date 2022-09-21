package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSchedule extends StObject {
  
  /**
    * The day when the Identity Resolution Job should run every week.
    */
  var DayOfTheWeek: JobScheduleDayOfTheWeek
  
  /**
    * The time when the Identity Resolution Job should run every week.
    */
  var Time: JobScheduleTime
}
object JobSchedule {
  
  inline def apply(DayOfTheWeek: JobScheduleDayOfTheWeek, Time: JobScheduleTime): JobSchedule = {
    val __obj = js.Dynamic.literal(DayOfTheWeek = DayOfTheWeek.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSchedule]
  }
  
  extension [Self <: JobSchedule](x: Self) {
    
    inline def setDayOfTheWeek(value: JobScheduleDayOfTheWeek): Self = StObject.set(x, "DayOfTheWeek", value.asInstanceOf[js.Any])
    
    inline def setTime(value: JobScheduleTime): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
