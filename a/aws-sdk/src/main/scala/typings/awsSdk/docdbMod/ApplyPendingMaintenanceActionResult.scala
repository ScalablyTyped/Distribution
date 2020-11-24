package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyPendingMaintenanceActionResult extends js.Object {
  
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.docdbMod.ResourcePendingMaintenanceActions] = js.native
}
object ApplyPendingMaintenanceActionResult {
  
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
  
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResultOps[Self <: ApplyPendingMaintenanceActionResult] (val x: Self) extends AnyVal {
    
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
    def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = this.set("ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePendingMaintenanceActions: Self = this.set("ResourcePendingMaintenanceActions", js.undefined)
  }
}
