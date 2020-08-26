package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSchedule extends js.Object {
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
  implicit class TaskScheduleOps[Self <: TaskSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScheduleExpression(value: ScheduleExpressionCron): Self = this.set("ScheduleExpression", value.asInstanceOf[js.Any])
  }
  
}

