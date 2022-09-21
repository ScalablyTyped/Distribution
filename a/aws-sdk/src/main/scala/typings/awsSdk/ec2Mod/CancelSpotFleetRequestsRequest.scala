package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: SpotFleetRequestIdList
  
  /**
    * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
    */
  var TerminateInstances: Boolean
}
object CancelSpotFleetRequestsRequest {
  
  inline def apply(SpotFleetRequestIds: SpotFleetRequestIdList, TerminateInstances: Boolean): CancelSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestIds = SpotFleetRequestIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsRequest]
  }
  
  extension [Self <: CancelSpotFleetRequestsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSpotFleetRequestIds(value: SpotFleetRequestIdList): Self = StObject.set(x, "SpotFleetRequestIds", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestIdsVarargs(value: SpotFleetRequestId*): Self = StObject.set(x, "SpotFleetRequestIds", js.Array(value*))
    
    inline def setTerminateInstances(value: Boolean): Self = StObject.set(x, "TerminateInstances", value.asInstanceOf[js.Any])
  }
}
