package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceWindowTargetResult extends js.Object {
  
  /**
    * The updated description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * The updated name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The updated owner.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  
  /**
    * The updated targets.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The maintenance window ID specified in the update request.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  
  /**
    * The target ID specified in the update request.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}
object UpdateMaintenanceWindowTargetResult {
  
  @scala.inline
  def apply(): UpdateMaintenanceWindowTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetResult]
  }
  
  @scala.inline
  implicit class UpdateMaintenanceWindowTargetResultOps[Self <: UpdateMaintenanceWindowTargetResult] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: MaintenanceWindowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = this.set("OwnerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerInformation: Self = this.set("OwnerInformation", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("WindowId", js.undefined)
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowTargetId: Self = this.set("WindowTargetId", js.undefined)
  }
}
