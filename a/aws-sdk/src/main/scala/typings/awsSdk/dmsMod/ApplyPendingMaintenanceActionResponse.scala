package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyPendingMaintenanceActionResponse extends StObject {
  
  /**
    * The AWS DMS resource that the pending maintenance action will be applied to.
    */
  var ResourcePendingMaintenanceActions: js.UndefOr[typings.awsSdk.dmsMod.ResourcePendingMaintenanceActions] = js.native
}
object ApplyPendingMaintenanceActionResponse {
  
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
  
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResponseMutableBuilder[Self <: ApplyPendingMaintenanceActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = StObject.set(x, "ResourcePendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePendingMaintenanceActionsUndefined: Self = StObject.set(x, "ResourcePendingMaintenanceActions", js.undefined)
  }
}
