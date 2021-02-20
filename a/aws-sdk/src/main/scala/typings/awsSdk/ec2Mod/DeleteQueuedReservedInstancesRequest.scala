package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedReservedInstancesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the Reserved Instances.
    */
  var ReservedInstancesIds: DeleteQueuedReservedInstancesIdList = js.native
}
object DeleteQueuedReservedInstancesRequest {
  
  @scala.inline
  def apply(ReservedInstancesIds: DeleteQueuedReservedInstancesIdList): DeleteQueuedReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedReservedInstancesRequest]
  }
  
  @scala.inline
  implicit class DeleteQueuedReservedInstancesRequestMutableBuilder[Self <: DeleteQueuedReservedInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setReservedInstancesIds(value: DeleteQueuedReservedInstancesIdList): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdsVarargs(value: ReservationId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value :_*))
  }
}
