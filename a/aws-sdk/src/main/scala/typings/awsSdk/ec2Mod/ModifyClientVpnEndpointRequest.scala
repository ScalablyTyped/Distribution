package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClientVpnEndpointRequest extends StObject {
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientConnectOptions] = js.native
  
  /**
    * The ID of the Client VPN endpoint to modify.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionLogOptions] = js.native
  
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two DNS servers.
    */
  var DnsServers: js.UndefOr[DnsServersOptionsModifyStructure] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of one or more security groups to apply to the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  
  /**
    * Specify whether to enable the self-service portal for the Client VPN endpoint.
    */
  var SelfServicePortal: js.UndefOr[typings.awsSdk.ec2Mod.SelfServicePortal] = js.native
  
  /**
    * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate Manager (ACM).
    */
  var ServerCertificateArn: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the VPN is split-tunnel. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the VPC to associate with the Client VPN endpoint.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
  
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.native
}
object ModifyClientVpnEndpointRequest {
  
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId): ModifyClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientVpnEndpointRequest]
  }
  
  @scala.inline
  implicit class ModifyClientVpnEndpointRequestMutableBuilder[Self <: ModifyClientVpnEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientConnectOptions(value: ClientConnectOptions): Self = StObject.set(x, "ClientConnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConnectOptionsUndefined: Self = StObject.set(x, "ClientConnectOptions", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLogOptions(value: ConnectionLogOptions): Self = StObject.set(x, "ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLogOptionsUndefined: Self = StObject.set(x, "ConnectionLogOptions", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDnsServers(value: DnsServersOptionsModifyStructure): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSelfServicePortal(value: SelfServicePortal): Self = StObject.set(x, "SelfServicePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfServicePortalUndefined: Self = StObject.set(x, "SelfServicePortal", js.undefined)
    
    @scala.inline
    def setServerCertificateArn(value: String): Self = StObject.set(x, "ServerCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArnUndefined: Self = StObject.set(x, "ServerCertificateArn", js.undefined)
    
    @scala.inline
    def setSplitTunnel(value: Boolean): Self = StObject.set(x, "SplitTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitTunnelUndefined: Self = StObject.set(x, "SplitTunnel", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpnPort(value: Integer): Self = StObject.set(x, "VpnPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnPortUndefined: Self = StObject.set(x, "VpnPort", js.undefined)
  }
}
