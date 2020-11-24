package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTaskWithMaintenanceWindowResult extends js.Object {
  
  /**
    * The ID of the task in the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}
object RegisterTaskWithMaintenanceWindowResult {
  
  @scala.inline
  def apply(): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class RegisterTaskWithMaintenanceWindowResultOps[Self <: RegisterTaskWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
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
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = this.set("WindowTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowTaskId: Self = this.set("WindowTaskId", js.undefined)
  }
}
