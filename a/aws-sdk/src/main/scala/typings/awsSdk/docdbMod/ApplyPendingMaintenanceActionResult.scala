package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyPendingMaintenanceActionResult extends StObject {
  
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.docdbMod.ResourcePendingMaintenanceActions] = js.native
}
object ApplyPendingMaintenanceActionResult {
  
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResult]
  }
  
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResultMutableBuilder[Self <: ApplyPendingMaintenanceActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = StObject.set(x, "ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePendingMaintenanceActionsUndefined: Self = StObject.set(x, "ResourcePendingMaintenanceActions", js.undefined)
  }
}
