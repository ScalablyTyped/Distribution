package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePendingMaintenanceActions extends StObject {
  
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.docdbMod.PendingMaintenanceActionDetails] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
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
  implicit class ResourcePendingMaintenanceActionsMutableBuilder[Self <: ResourcePendingMaintenanceActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPendingMaintenanceActionDetails(value: PendingMaintenanceActionDetails): Self = StObject.set(x, "PendingMaintenanceActionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingMaintenanceActionDetailsUndefined: Self = StObject.set(x, "PendingMaintenanceActionDetails", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActionDetailsVarargs(value: PendingMaintenanceAction*): Self = StObject.set(x, "PendingMaintenanceActionDetails", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifier(value: String): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
  }
}
