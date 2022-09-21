package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationSetAction extends StObject {
  
  /**
    * Details about the Amazon Web Services Region that you're adding to the replication set.
    */
  var addRegionAction: js.UndefOr[AddRegionAction] = js.undefined
  
  /**
    * Details about the Amazon Web Services Region that you're deleting to the replication set.
    */
  var deleteRegionAction: js.UndefOr[DeleteRegionAction] = js.undefined
}
object UpdateReplicationSetAction {
  
  inline def apply(): UpdateReplicationSetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReplicationSetAction]
  }
  
  extension [Self <: UpdateReplicationSetAction](x: Self) {
    
    inline def setAddRegionAction(value: AddRegionAction): Self = StObject.set(x, "addRegionAction", value.asInstanceOf[js.Any])
    
    inline def setAddRegionActionUndefined: Self = StObject.set(x, "addRegionAction", js.undefined)
    
    inline def setDeleteRegionAction(value: DeleteRegionAction): Self = StObject.set(x, "deleteRegionAction", value.asInstanceOf[js.Any])
    
    inline def setDeleteRegionActionUndefined: Self = StObject.set(x, "deleteRegionAction", js.undefined)
  }
}
