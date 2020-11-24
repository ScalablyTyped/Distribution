package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePendingMaintenanceActions extends js.Object {
  
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.rdsMod.PendingMaintenanceActionDetails] = js.native
  
  /**
    * The ARN of the resource that has pending maintenance actions.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
}
object ResourcePendingMaintenanceActions {
  
  @scala.inline
  def apply(): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
  
  @scala.inline
  implicit class ResourcePendingMaintenanceActionsOps[Self <: ResourcePendingMaintenanceActions] (val x: Self) extends AnyVal {
    
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
    def setPendingMaintenanceActionDetailsVarargs(value: PendingMaintenanceAction*): Self = this.set("PendingMaintenanceActionDetails", js.Array(value :_*))
    
    @scala.inline
    def setPendingMaintenanceActionDetails(value: PendingMaintenanceActionDetails): Self = this.set("PendingMaintenanceActionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingMaintenanceActionDetails: Self = this.set("PendingMaintenanceActionDetails", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: String): Self = this.set("ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("ResourceIdentifier", js.undefined)
  }
}
