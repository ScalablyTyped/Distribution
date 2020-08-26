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
    Schedule: MaintenanceWindowSchedule
  ): CreateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(AllowUnassociatedTargets = AllowUnassociatedTargets.asInstanceOf[js.Any], Cutoff = Cutoff.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class CreateMaintenanceWindowRequestOps[Self <: CreateMaintenanceWindowRequest] (val x: Self) extends AnyVal {
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
    def setAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = this.set("AllowUnassociatedTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setCutoff(value: MaintenanceWindowCutoff): Self = this.set("Cutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: MaintenanceWindowDurationHours): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: MaintenanceWindowSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEndDate(value: MaintenanceWindowStringDateTime): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setScheduleOffset(value: MaintenanceWindowOffset): Self = this.set("ScheduleOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleOffset: Self = this.set("ScheduleOffset", js.undefined)
    @scala.inline
    def setScheduleTimezone(value: MaintenanceWindowTimezone): Self = this.set("ScheduleTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTimezone: Self = this.set("ScheduleTimezone", js.undefined)
    @scala.inline
    def setStartDate(value: MaintenanceWindowStringDateTime): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

