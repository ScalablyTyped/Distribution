package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMaintenanceWindowRequest extends js.Object {
  /**
    * Enables a maintenance window task to run on managed instances, even if you have not registered those instances as targets. If enabled, then you must specify the unregistered instances (by instance ID) when you register a task with the maintenance window. If you don't enable this option, then you must specify previously-registered targets when you register a task with the maintenance window.
    */
  var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets = js.native
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.ssmMod.ClientToken] = js.native
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: MaintenanceWindowCutoff = js.native
  /**
    * An optional description for the maintenance window. We recommend specifying a description to help you organize your maintenance windows. 
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: MaintenanceWindowDurationHours = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window.
    */
  var Name: MaintenanceWindowName = js.native
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: MaintenanceWindowSchedule = js.native
  /**
    * The number of days to wait after the date and time specified by a CRON expression before running the maintenance window. For example, the following cron expression schedules a maintenance window to run on the third Tuesday of every month at 11:30 PM.  cron(0 30 23 ? * TUE#3 *)  If the schedule offset is 2, the maintenance window won't run until two days later.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become active. StartDate allows you to delay activation of the maintenance window until the specified future date.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a maintenance window to identify the type of tasks it will run, the types of targets, and the environment it will run in. In this case, you could specify the following key name/value pairs:    Key=TaskType,Value=AgentUpdate     Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing maintenance window, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateMaintenanceWindowRequest {
  @scala.inline
  def apply(
    AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets,
    Cutoff: MaintenanceWindowCutoff,
    Duration: MaintenanceWindowDurationHours,
    Name: MaintenanceWindowName,
    Schedule: MaintenanceWindowSchedule,
    ClientToken: ClientToken = null,
    Description: MaintenanceWindowDescription = null,
    EndDate: MaintenanceWindowStringDateTime = null,
    ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined,
    ScheduleTimezone: MaintenanceWindowTimezone = null,
    StartDate: MaintenanceWindowStringDateTime = null,
    Tags: TagList = null
  ): CreateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(AllowUnassociatedTargets = AllowUnassociatedTargets.asInstanceOf[js.Any], Cutoff = Cutoff.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (!js.isUndefined(ScheduleOffset)) __obj.updateDynamic("ScheduleOffset")(ScheduleOffset.get.asInstanceOf[js.Any])
    if (ScheduleTimezone != null) __obj.updateDynamic("ScheduleTimezone")(ScheduleTimezone.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMaintenanceWindowRequest]
  }
}

