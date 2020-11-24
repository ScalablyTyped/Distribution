package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledWindowExecution extends js.Object {
  
  /**
    * The time, in ISO-8601 Extended format, that the maintenance window is scheduled to be run.
    */
  var ExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  
  /**
    * The name of the maintenance window to be run.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The ID of the maintenance window to be run.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}
object ScheduledWindowExecution {
  
  @scala.inline
  def apply(): ScheduledWindowExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledWindowExecution]
  }
  
  @scala.inline
  implicit class ScheduledWindowExecutionOps[Self <: ScheduledWindowExecution] (val x: Self) extends AnyVal {
    
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
    def setExecutionTime(value: MaintenanceWindowStringDateTime): Self = this.set("ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTime: Self = this.set("ExecutionTime", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("WindowId", js.undefined)
  }
}
