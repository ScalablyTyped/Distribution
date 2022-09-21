package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the security groups to apply to the associated target network. Up to 5 security groups can be applied to an associated target network.
    */
  var SecurityGroupIds: ClientVpnSecurityGroupIdSet
  
  /**
    * The ID of the VPC in which the associated target network is located.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId
}
object ApplySecurityGroupsToClientVpnTargetNetworkRequest {
  
  inline def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet,
    VpcId: VpcId
  ): ApplySecurityGroupsToClientVpnTargetNetworkRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySecurityGroupsToClientVpnTargetNetworkRequest]
  }
  
  extension [Self <: ApplySecurityGroupsToClientVpnTargetNetworkRequest](x: Self) {
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
