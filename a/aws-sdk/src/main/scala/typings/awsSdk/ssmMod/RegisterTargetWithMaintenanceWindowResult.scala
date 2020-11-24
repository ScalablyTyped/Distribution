package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTargetWithMaintenanceWindowResult extends js.Object {
  
  /**
    * The ID of the target definition in this maintenance window.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}
object RegisterTargetWithMaintenanceWindowResult {
  
  @scala.inline
  def apply(): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class RegisterTargetWithMaintenanceWindowResultOps[Self <: RegisterTargetWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
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
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowTargetId: Self = this.set("WindowTargetId", js.undefined)
  }
}
