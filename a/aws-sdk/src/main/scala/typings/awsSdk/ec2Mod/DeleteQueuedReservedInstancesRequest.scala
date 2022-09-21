package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedReservedInstancesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the Reserved Instances.
    */
  var ReservedInstancesIds: DeleteQueuedReservedInstancesIdList
}
object DeleteQueuedReservedInstancesRequest {
  
  inline def apply(ReservedInstancesIds: DeleteQueuedReservedInstancesIdList): DeleteQueuedReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedReservedInstancesRequest]
  }
  
  extension [Self <: DeleteQueuedReservedInstancesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setReservedInstancesIds(value: DeleteQueuedReservedInstancesIdList): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdsVarargs(value: ReservationId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value*))
  }
}
