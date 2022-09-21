package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceMaintenanceOptionsRequest extends StObject {
  
  /**
    * Disables the automatic recovery behavior of your instance or sets it to default.
    */
  var AutoRecovery: js.UndefOr[InstanceAutoRecoveryState] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
}
object ModifyInstanceMaintenanceOptionsRequest {
  
  inline def apply(InstanceId: InstanceId): ModifyInstanceMaintenanceOptionsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceMaintenanceOptionsRequest]
  }
  
  extension [Self <: ModifyInstanceMaintenanceOptionsRequest](x: Self) {
    
    inline def setAutoRecovery(value: InstanceAutoRecoveryState): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
