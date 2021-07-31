package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePendingMaintenanceActions extends StObject {
  
  /**
    * Detailed information about the pending maintenance action.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typings.awsSdk.dmsMod.PendingMaintenanceActionDetails] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN) for AWS DMS in the DMS documentation.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.undefined
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
