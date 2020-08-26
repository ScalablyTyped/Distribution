package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScheduledActionMessage extends js.Object {
  /**
    * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about state of the scheduled action, see ScheduledAction. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  /**
    * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * The IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction. 
    */
  var IamRole: String = js.native
  /**
    * The schedule in at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: String = js.native
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action. The name must be unique within an account. For more information about this parameter, see ScheduledAction. 
    */
  var ScheduledActionName: String = js.native
  /**
    * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: ScheduledActionType = js.native
}

object CreateScheduledActionMessage {
  @scala.inline
  def apply(IamRole: String, Schedule: String, ScheduledActionName: String, TargetAction: ScheduledActionType): CreateScheduledActionMessage = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], TargetAction = TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledActionMessage]
  }
  @scala.inline
  implicit class CreateScheduledActionMessageOps[Self <: CreateScheduledActionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIamRole(value: String): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: String): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledActionName(value: String): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetAction(value: ScheduledActionType): Self = this.set("TargetAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: BooleanOptional): Self = this.set("Enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("Enable", js.undefined)
    @scala.inline
    def setEndTime(value: TStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setScheduledActionDescription(value: String): Self = this.set("ScheduledActionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledActionDescription: Self = this.set("ScheduledActionDescription", js.undefined)
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

