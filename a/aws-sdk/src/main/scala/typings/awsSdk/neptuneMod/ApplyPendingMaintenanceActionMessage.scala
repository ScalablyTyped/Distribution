package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPendingMaintenanceActionMessage extends StObject {
  
  /**
    * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade 
    */
  var ApplyAction: String
  
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String
  
  /**
    * The Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN).
    */
  var ResourceIdentifier: String
}
object ApplyPendingMaintenanceActionMessage {
  
  inline def apply(ApplyAction: String, OptInType: String, ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
  
  extension [Self <: ApplyPendingMaintenanceActionMessage](x: Self) {
    
    inline def setApplyAction(value: String): Self = StObject.set(x, "ApplyAction", value.asInstanceOf[js.Any])
    
    inline def setOptInType(value: String): Self = StObject.set(x, "OptInType", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: String): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
  }
}
