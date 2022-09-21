package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnEndpoint extends StObject {
  
  /**
    * Information about the associated target networks. A target network is a subnet in a VPC.
    */
  var AssociatedTargetNetworks: js.UndefOr[AssociatedTargetNetworkSet] = js.undefined
  
  /**
    * Information about the authentication method used by the Client VPN endpoint.
    */
  var AuthenticationOptions: js.UndefOr[ClientVpnAuthenticationList] = js.undefined
  
  /**
    * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
    */
  var ClientCidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[ClientConnectResponseOptions] = js.undefined
  
  /**
    * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients when a VPN session is established.
    */
  var ClientLoginBannerOptions: js.UndefOr[ClientLoginBannerResponseOptions] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the client connection logging options for the Client VPN endpoint.
    */
  var ConnectionLogOptions: js.UndefOr[ConnectionLogResponseOptions] = js.undefined
  
  /**
    * The date and time the Client VPN endpoint was created.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the Client VPN endpoint was deleted, if applicable.
    */
  var DeletionTime: js.UndefOr[String] = js.undefined
  
  /**
    * A brief description of the endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS name to be used by clients when connecting to the Client VPN endpoint.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the DNS servers to be used for DNS resolution. 
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The IDs of the security groups for the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.undefined
  
  /**
    * The URL of the self-service portal.
    */
  var SelfServicePortalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the server certificate.
    */
  var ServerCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum VPN session duration time in hours. Valid values: 8 | 10 | 12 | 24  Default value: 24 
    */
  var SessionTimeoutHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether split-tunnel is enabled in the Client VPN endpoint. For information about split-tunnel VPN endpoints, see Split-Tunnel Client VPN endpoint in the Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.undefined
  
  /**
    * Any tags assigned to the Client VPN endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The transport protocol used by the Client VPN endpoint.
    */
  var TransportProtocol: js.UndefOr[typings.awsSdk.ec2Mod.TransportProtocol] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
  
  /**
    * The port number for the Client VPN endpoint.
    */
  var VpnPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The protocol used by the VPN session.
    */
  var VpnProtocol: js.UndefOr[typings.awsSdk.ec2Mod.VpnProtocol] = js.undefined
}
object ClientVpnEndpoint {
  
  inline def apply(): ClientVpnEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpoint]
  }
  
  extension [Self <: ClientVpnEndpoint](x: Self) {
    
    inline def setAssociatedTargetNetworks(value: AssociatedTargetNetworkSet): Self = StObject.set(x, "AssociatedTargetNetworks", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTargetNetworksUndefined: Self = StObject.set(x, "AssociatedTargetNetworks", js.undefined)
    
    inline def setAssociatedTargetNetworksVarargs(value: AssociatedTargetNetwork*): Self = StObject.set(x, "AssociatedTargetNetworks", js.Array(value*))
    
    inline def setAuthenticationOptions(value: ClientVpnAuthenticationList): Self = StObject.set(x, "AuthenticationOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationOptionsUndefined: Self = StObject.set(x, "AuthenticationOptions", js.undefined)
    
    inline def setAuthenticationOptionsVarargs(value: ClientVpnAuthentication*): Self = StObject.set(x, "AuthenticationOptions", js.Array(value*))
    
    inline def setClientCidrBlock(value: String): Self = StObject.set(x, "ClientCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setClientCidrBlockUndefined: Self = StObject.set(x, "ClientCidrBlock", js.undefined)
    
    inline def setClientConnectOptions(value: ClientConnectResponseOptions): Self = StObject.set(x, "ClientConnectOptions", value.asInstanceOf[js.Any])
    
    inline def setClientConnectOptionsUndefined: Self = StObject.set(x, "ClientConnectOptions", js.undefined)
    
    inline def setClientLoginBannerOptions(value: ClientLoginBannerResponseOptions): Self = StObject.set(x, "ClientLoginBannerOptions", value.asInstanceOf[js.Any])
    
    inline def setClientLoginBannerOptionsUndefined: Self = StObject.set(x, "ClientLoginBannerOptions", js.undefined)
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setConnectionLogOptions(value: ConnectionLogResponseOptions): Self = StObject.set(x, "ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectionLogOptionsUndefined: Self = StObject.set(x, "ConnectionLogOptions", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setDnsServers(value: ValueStringList): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    inline def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    inline def setDnsServersVarargs(value: String*): Self = StObject.set(x, "DnsServers", js.Array(value*))
    
    inline def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSelfServicePortalUrl(value: String): Self = StObject.set(x, "SelfServicePortalUrl", value.asInstanceOf[js.Any])
    
    inline def setSelfServicePortalUrlUndefined: Self = StObject.set(x, "SelfServicePortalUrl", js.undefined)
    
    inline def setServerCertificateArn(value: String): Self = StObject.set(x, "ServerCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateArnUndefined: Self = StObject.set(x, "ServerCertificateArn", js.undefined)
    
    inline def setSessionTimeoutHours(value: Integer): Self = StObject.set(x, "SessionTimeoutHours", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutHoursUndefined: Self = StObject.set(x, "SessionTimeoutHours", js.undefined)
    
    inline def setSplitTunnel(value: Boolean): Self = StObject.set(x, "SplitTunnel", value.asInstanceOf[js.Any])
    
    inline def setSplitTunnelUndefined: Self = StObject.set(x, "SplitTunnel", js.undefined)
    
    inline def setStatus(value: ClientVpnEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransportProtocol(value: TransportProtocol): Self = StObject.set(x, "TransportProtocol", value.asInstanceOf[js.Any])
    
    inline def setTransportProtocolUndefined: Self = StObject.set(x, "TransportProtocol", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpnPort(value: Integer): Self = StObject.set(x, "VpnPort", value.asInstanceOf[js.Any])
    
    inline def setVpnPortUndefined: Self = StObject.set(x, "VpnPort", js.undefined)
    
    inline def setVpnProtocol(value: VpnProtocol): Self = StObject.set(x, "VpnProtocol", value.asInstanceOf[js.Any])
    
    inline def setVpnProtocolUndefined: Self = StObject.set(x, "VpnProtocol", js.undefined)
  }
}
