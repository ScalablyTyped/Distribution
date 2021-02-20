package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklyAutoScalingSchedule extends StObject {
  
  /**
    * The schedule for Friday.
    */
  var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Monday.
    */
  var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Saturday.
    */
  var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Sunday.
    */
  var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Thursday.
    */
  var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Tuesday.
    */
  var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Wednesday.
    */
  var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
}
object WeeklyAutoScalingSchedule {
  
  @scala.inline
  def apply(): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
  
  @scala.inline
  implicit class WeeklyAutoScalingScheduleMutableBuilder[Self <: WeeklyAutoScalingSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Friday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFridayUndefined: Self = StObject.set(x, "Friday", js.undefined)
    
    @scala.inline
    def setMonday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Monday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMondayUndefined: Self = StObject.set(x, "Monday", js.undefined)
    
    @scala.inline
    def setSaturday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Saturday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturdayUndefined: Self = StObject.set(x, "Saturday", js.undefined)
    
    @scala.inline
    def setSunday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Sunday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSundayUndefined: Self = StObject.set(x, "Sunday", js.undefined)
    
    @scala.inline
    def setThursday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Thursday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThursdayUndefined: Self = StObject.set(x, "Thursday", js.undefined)
    
    @scala.inline
    def setTuesday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Tuesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuesdayUndefined: Self = StObject.set(x, "Tuesday", js.undefined)
    
    @scala.inline
    def setWednesday(value: DailyAutoScalingSchedule): Self = StObject.set(x, "Wednesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWednesdayUndefined: Self = StObject.set(x, "Wednesday", js.undefined)
  }
}
