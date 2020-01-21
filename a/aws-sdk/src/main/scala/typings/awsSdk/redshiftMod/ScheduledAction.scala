package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledAction extends js.Object {
  /**
    * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not trigger. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see Using Identity-Based Policies for Amazon Redshift in the Amazon Redshift Cluster Management Guide. 
    */
  var IamRole: js.UndefOr[String] = js.native
  /**
    * List of times when the scheduled action will run. 
    */
  var NextInvocations: js.UndefOr[ScheduledActionTimeList] = js.native
  /**
    * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be separated by at least one hour. Format of at expressions is "at(yyyy-mm-ddThh:mm:ss)". For example, "at(2016-03-04T17:27:00)". Format of cron expressions is "cron(Minutes Hours Day-of-month Month Day-of-week Year)". For example, "cron(0, 10, *, *, MON, *)". For more information, see Cron Expressions in the Amazon CloudWatch Events User Guide.
    */
  var Schedule: js.UndefOr[String] = js.native
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.native
  /**
    * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger. 
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * The state of the scheduled action. For example, DISABLED. 
    */
  var State: js.UndefOr[ScheduledActionState] = js.native
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters.  "{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}". 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}

object ScheduledAction {
  @scala.inline
  def apply(
    EndTime: TStamp = null,
    IamRole: String = null,
    NextInvocations: ScheduledActionTimeList = null,
    Schedule: String = null,
    ScheduledActionDescription: String = null,
    ScheduledActionName: String = null,
    StartTime: TStamp = null,
    State: ScheduledActionState = null,
    TargetAction: ScheduledActionType = null
  ): ScheduledAction = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole.asInstanceOf[js.Any])
    if (NextInvocations != null) __obj.updateDynamic("NextInvocations")(NextInvocations.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (ScheduledActionDescription != null) __obj.updateDynamic("ScheduledActionDescription")(ScheduledActionDescription.asInstanceOf[js.Any])
    if (ScheduledActionName != null) __obj.updateDynamic("ScheduledActionName")(ScheduledActionName.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TargetAction != null) __obj.updateDynamic("TargetAction")(TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledAction]
  }
}

