package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowIdentity extends js.Object {
  
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.native
  
  /**
    * A description of the maintenance window.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.native
  
  /**
    * Indicates whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.native
  
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The next time the maintenance window will actually run, taking into account any specified times for the maintenance window to become active or inactive.
    */
  var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.native
  
  /**
    * The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.native
  
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}
object MaintenanceWindowIdentity {
  
  @scala.inline
  def apply(): MaintenanceWindowIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowIdentity]
  }
  
  @scala.inline
  implicit class MaintenanceWindowIdentityOps[Self <: MaintenanceWindowIdentity] (val x: Self) extends AnyVal {
    
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
    def setNextExecutionTime(value: MaintenanceWindowStringDateTime): Self = this.set("NextExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextExecutionTime: Self = this.set("NextExecutionTime", js.undefined)
    
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
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("WindowId", js.undefined)
  }
}
