package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePendingMaintenanceActions extends js.Object {
  
  /**
    * Detailed information about the pending maintenance action.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.dmsMod.PendingMaintenanceActionDetails] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN) for AWS DMS in the DMS documentation.
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
