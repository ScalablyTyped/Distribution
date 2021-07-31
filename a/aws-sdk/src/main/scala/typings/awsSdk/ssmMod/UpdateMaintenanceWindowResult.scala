package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceWindowResult extends StObject {
  
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.undefined
  
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.undefined
  
  /**
    * An optional description of the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.undefined
  
  /**
    * Whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.undefined
  
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive. The maintenance window will not run after this specified time.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.undefined
  
  /**
    * The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.undefined
  
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.undefined
  
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active. The maintenance window will not run before this specified time.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.undefined
  
  /**
    * The ID of the created maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}
object UpdateMaintenanceWindowResult {
  
  @scala.inline
  def apply(): UpdateMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceWindowResultMutableBuilder[Self <: UpdateMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = StObject.set(x, "AllowUnassociatedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnassociatedTargetsUndefined: Self = StObject.set(x, "AllowUnassociatedTargets", js.undefined)
    
    @scala.inline
    def setCutoff(value: MaintenanceWindowCutoff): Self = StObject.set(x, "Cutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoffUndefined: Self = StObject.set(x, "Cutoff", js.undefined)
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDuration(value: MaintenanceWindowDurationHours): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setEnabled(value: MaintenanceWindowEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEndDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSchedule(value: MaintenanceWindowSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOffset(value: MaintenanceWindowOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    @scala.inline
    def setScheduleTimezone(value: MaintenanceWindowTimezone): Self = StObject.set(x, "ScheduleTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimezoneUndefined: Self = StObject.set(x, "ScheduleTimezone", js.undefined)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setStartDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
