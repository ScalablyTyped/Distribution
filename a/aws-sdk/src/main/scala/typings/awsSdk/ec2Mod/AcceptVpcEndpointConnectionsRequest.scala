package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptVpcEndpointConnectionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC endpoint service.
    */
  var ServiceId: VpcEndpointServiceId
  
  /**
    * The IDs of one or more interface VPC endpoints.
    */
  var VpcEndpointIds: VpcEndpointIdList
}
object AcceptVpcEndpointConnectionsRequest {
  
  inline def apply(ServiceId: VpcEndpointServiceId, VpcEndpointIds: VpcEndpointIdList): AcceptVpcEndpointConnectionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any], VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptVpcEndpointConnectionsRequest]
  }
  
  extension [Self <: AcceptVpcEndpointConnectionsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIds(value: VpcEndpointIdList): Self = StObject.set(x, "VpcEndpointIds", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "VpcEndpointIds", js.Array(value :_*))
  }
}
