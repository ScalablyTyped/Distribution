package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyPendingMaintenanceActionMessage extends StObject {
  
  /**
    * The pending maintenance action to apply to this resource. Valid values: system-update, db-upgrade, hardware-maintenance, ca-certificate-rotation 
    */
  var ApplyAction: String = js.native
  
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. An opt-in request of type immediate can't be undone. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String = js.native
  
  /**
    * The RDS Amazon Resource Name (ARN) of the resource that the pending maintenance action applies to. For information about creating an ARN, see  Constructing an RDS Amazon Resource Name (ARN).
    */
  var ResourceIdentifier: String = js.native
}
object ApplyPendingMaintenanceActionMessage {
  
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ResourceIdentifier: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
  
  @scala.inline
  implicit class ApplyPendingMaintenanceActionMessageMutableBuilder[Self <: ApplyPendingMaintenanceActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyAction(value: String): Self = StObject.set(x, "ApplyAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInType(value: String): Self = StObject.set(x, "OptInType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: String): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
  }
}
