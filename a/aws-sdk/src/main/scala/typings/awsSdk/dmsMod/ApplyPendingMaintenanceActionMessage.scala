package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPendingMaintenanceActionMessage extends StObject {
  
  /**
    * The pending maintenance action to apply to this resource.
    */
  var ApplyAction: String
  
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request of type immediate. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String
  
  /**
    * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
    */
  var ReplicationInstanceArn: String
}
object ApplyPendingMaintenanceActionMessage {
  
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ReplicationInstanceArn: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction.asInstanceOf[js.Any], OptInType = OptInType.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
  
  @scala.inline
  implicit class ApplyPendingMaintenanceActionMessageMutableBuilder[Self <: ApplyPendingMaintenanceActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyAction(value: String): Self = StObject.set(x, "ApplyAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInType(value: String): Self = StObject.set(x, "OptInType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
