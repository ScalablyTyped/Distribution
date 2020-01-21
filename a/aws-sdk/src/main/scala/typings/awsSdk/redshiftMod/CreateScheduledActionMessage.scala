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
  def apply(
    IamRole: String,
    Schedule: String,
    ScheduledActionName: String,
    TargetAction: ScheduledActionType,
    Enable: js.UndefOr[scala.Boolean] = js.undefined,
    EndTime: TStamp = null,
    ScheduledActionDescription: String = null,
    StartTime: TStamp = null
  ): CreateScheduledActionMessage = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], TargetAction = TargetAction.asInstanceOf[js.Any])
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ScheduledActionDescription != null) __obj.updateDynamic("ScheduledActionDescription")(ScheduledActionDescription.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledActionMessage]
  }
}

