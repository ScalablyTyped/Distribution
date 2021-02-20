package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnEndpoint extends StObject {
  
  /**
    * Information about the associated target networks. A target network is a subnet in a VPC.
    */
  var AssociatedTargetNetworks: js.UndefOr[AssociatedTargetNetworkSet] = js.native
  
  /**
    * Information about the authentication method used by the Client VPN endpoint.
    */
  var AuthenticationOptions: js.UndefOr[ClientVpnAuthenticationList] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
    */
  var ClientCidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[ClientConnectResponseOptions] = js.native
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * Information about the client connection logging options for the Client VPN endpoint.
    */
  var ConnectionLogOptions: js.UndefOr[ConnectionLogResponseOptions] = js.native
  
  /**
    * The date and time the Client VPN endpoint was created.
    */
  var CreationTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time the Client VPN endpoint was deleted, if applicable.
    */
  var DeletionTime: js.UndefOr[String] = js.native
  
  /**
    * A brief description of the endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The DNS name to be used by clients when connecting to the Client VPN endpoint.
    */
  var DnsName: js.UndefOr[String] = js.native
  
  /**
    * Information about the DNS servers to be used for DNS resolution. 
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The IDs of the security groups for the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  
  /**
    * The URL of the self-service portal.
    */
  var SelfServicePortalUrl: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the server certificate.
    */
  var ServerCertificateArn: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
  
  /**
    * Any tags assigned to the Client VPN endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The transport protocol used by the Client VPN endpoint.
    */
  var TransportProtocol: js.UndefOr[typings.awsSdk.ec2Mod.TransportProtocol] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
  
  /**
    * The port number for the Client VPN endpoint.
    */
  var VpnPort: js.UndefOr[Integer] = js.native
  
  /**
    * The protocol used by the VPN session.
    */
  var VpnProtocol: js.UndefOr[typings.awsSdk.ec2Mod.VpnProtocol] = js.native
}
object ClientVpnEndpoint {
  
  @scala.inline
  def apply(): ClientVpnEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpoint]
  }
  
  @scala.inline
  implicit class ClientVpnEndpointMutableBuilder[Self <: ClientVpnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedTargetNetworks(value: AssociatedTargetNetworkSet): Self = StObject.set(x, "AssociatedTargetNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedTargetNetworksUndefined: Self = StObject.set(x, "AssociatedTargetNetworks", js.undefined)
    
    @scala.inline
    def setAssociatedTargetNetworksVarargs(value: AssociatedTargetNetwork*): Self = StObject.set(x, "AssociatedTargetNetworks", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationOptions(value: ClientVpnAuthenticationList): Self = StObject.set(x, "AuthenticationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationOptionsUndefined: Self = StObject.set(x, "AuthenticationOptions", js.undefined)
    
    @scala.inline
    def setAuthenticationOptionsVarargs(value: ClientVpnAuthentication*): Self = StObject.set(x, "AuthenticationOptions", js.Array(value :_*))
    
    @scala.inline
    def setClientCidrBlock(value: String): Self = StObject.set(x, "ClientCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCidrBlockUndefined: Self = StObject.set(x, "ClientCidrBlock", js.undefined)
    
    @scala.inline
    def setClientConnectOptions(value: ClientConnectResponseOptions): Self = StObject.set(x, "ClientConnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConnectOptionsUndefined: Self = StObject.set(x, "ClientConnectOptions", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setConnectionLogOptions(value: ConnectionLogResponseOptions): Self = StObject.set(x, "ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLogOptionsUndefined: Self = StObject.set(x, "ConnectionLogOptions", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setDnsServers(value: ValueStringList): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = StObject.set(x, "DnsServers", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSelfServicePortalUrl(value: String): Self = StObject.set(x, "SelfServicePortalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfServicePortalUrlUndefined: Self = StObject.set(x, "SelfServicePortalUrl", js.undefined)
    
    @scala.inline
    def setServerCertificateArn(value: String): Self = StObject.set(x, "ServerCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArnUndefined: Self = StObject.set(x, "ServerCertificateArn", js.undefined)
    
    @scala.inline
    def setSplitTunnel(value: Boolean): Self = StObject.set(x, "SplitTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitTunnelUndefined: Self = StObject.set(x, "SplitTunnel", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransportProtocol(value: TransportProtocol): Self = StObject.set(x, "TransportProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportProtocolUndefined: Self = StObject.set(x, "TransportProtocol", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setVpnPort(value: Integer): Self = StObject.set(x, "VpnPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnPortUndefined: Self = StObject.set(x, "VpnPort", js.undefined)
    
    @scala.inline
    def setVpnProtocol(value: VpnProtocol): Self = StObject.set(x, "VpnProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnProtocolUndefined: Self = StObject.set(x, "VpnProtocol", js.undefined)
  }
}
