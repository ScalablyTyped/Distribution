package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowRequest extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.native
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.native
  /**
    * An optional description for the update request.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.native
  /**
    * Whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. 
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.native
  /**
    * The number of days to wait after the date and time specified by a CRON expression before running the maintenance window. For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.  cron(0 30 23 ? * TUE#3 *)  If the schedule offset is 2, the maintenance window won't run until two days later.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The ID of the maintenance window to update.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object UpdateMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): UpdateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowRequestOps[Self <: UpdateMaintenanceWindowRequest] (val x: Self) extends AnyVal {
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
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = this.set("AllowUnassociatedTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnassociatedTargets: Self = this.set("AllowUnassociatedTargets", js.undefined)
    @scala.inline
    def setCutoff(value: MaintenanceWindowCutoff): Self = this.set("Cutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutoff: Self = this.set("Cutoff", js.undefined)
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDuration(value: MaintenanceWindowDurationHours): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setEnabled(value: MaintenanceWindowEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setEndDate(value: MaintenanceWindowStringDateTime): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
    @scala.inline
    def setSchedule(value: MaintenanceWindowSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
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
  }
  
}

