package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeClientVpnIngressRequest extends StObject {
  
  /**
    * The ID of the Active Directory group for which to revoke access. 
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether access should be revoked for all clients.
    */
  var RevokeAllGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being removed.
    */
  var TargetNetworkCidr: String = js.native
}
object RevokeClientVpnIngressRequest {
  
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): RevokeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClientVpnIngressRequest]
  }
  
  @scala.inline
  implicit class RevokeClientVpnIngressRequestMutableBuilder[Self <: RevokeClientVpnIngressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessGroupId(value: String): Self = StObject.set(x, "AccessGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessGroupIdUndefined: Self = StObject.set(x, "AccessGroupId", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRevokeAllGroups(value: Boolean): Self = StObject.set(x, "RevokeAllGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokeAllGroupsUndefined: Self = StObject.set(x, "RevokeAllGroups", js.undefined)
    
    @scala.inline
    def setTargetNetworkCidr(value: String): Self = StObject.set(x, "TargetNetworkCidr", value.asInstanceOf[js.Any])
  }
}
