package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskSchedule extends StObject {
  
  /**
    * A cron expression that specifies when AWS DataSync initiates a scheduled transfer from a source to a destination location. 
    */
  var ScheduleExpression: ScheduleExpressionCron = js.native
}
object TaskSchedule {
  
  @scala.inline
  def apply(ScheduleExpression: ScheduleExpressionCron): TaskSchedule = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSchedule]
  }
  
  @scala.inline
  implicit class TaskScheduleMutableBuilder[Self <: TaskSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpressionCron): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
