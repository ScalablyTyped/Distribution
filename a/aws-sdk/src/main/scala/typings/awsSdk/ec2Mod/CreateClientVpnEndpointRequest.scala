package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientVpnEndpointRequest extends StObject {
  
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  var AuthenticationOptions: ClientVpnAuthenticationRequestList
  
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  var ClientCidrBlock: String
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientConnectOptions] = js.undefined
  
  /**
    * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients when a VPN session is established.
    */
  var ClientLoginBannerOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientLoginBannerOptions] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: typings.awsSdk.ec2Mod.ConnectionLogOptions
  
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.undefined
  
  /**
    * Specify whether to enable the self-service portal for the Client VPN endpoint. Default Value: enabled 
    */
  var SelfServicePortal: js.UndefOr[typings.awsSdk.ec2Mod.SelfServicePortal] = js.undefined
  
  /**
    * The ARN of the server certificate. For more information, see the Certificate Manager User Guide.
    */
  var ServerCertificateArn: String
  
  /**
    * The maximum VPN session duration time in hours. Valid values: 8 | 10 | 12 | 24  Default value: 24 
    */
  var SessionTimeoutHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether split-tunnel is enabled on the Client VPN endpoint. By default, split-tunnel on a VPN endpoint is disabled. For information about split-tunnel VPN endpoints, see Split-tunnel Client VPN endpoint in the Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags to apply to the Client VPN endpoint during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The transport protocol to be used by the VPN session. Default value: udp 
    */
  var TransportProtocol: js.UndefOr[typings.awsSdk.ec2Mod.TransportProtocol] = js.undefined
  
  /**
    * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
  
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.undefined
}
object CreateClientVpnEndpointRequest {
  
  inline def apply(
    AuthenticationOptions: ClientVpnAuthenticationRequestList,
    ClientCidrBlock: String,
    ConnectionLogOptions: ConnectionLogOptions,
    ServerCertificateArn: String
  ): CreateClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(AuthenticationOptions = AuthenticationOptions.asInstanceOf[js.Any], ClientCidrBlock = ClientCidrBlock.asInstanceOf[js.Any], ConnectionLogOptions = ConnectionLogOptions.asInstanceOf[js.Any], ServerCertificateArn = ServerCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointRequest]
  }
  
  extension [Self <: CreateClientVpnEndpointRequest](x: Self) {
    
    inline def setAuthenticationOptions(value: ClientVpnAuthenticationRequestList): Self = StObject.set(x, "AuthenticationOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationOptionsVarargs(value: ClientVpnAuthenticationRequest*): Self = StObject.set(x, "AuthenticationOptions", js.Array(value*))
    
    inline def setClientCidrBlock(value: String): Self = StObject.set(x, "ClientCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setClientConnectOptions(value: ClientConnectOptions): Self = StObject.set(x, "ClientConnectOptions", value.asInstanceOf[js.Any])
    
    inline def setClientConnectOptionsUndefined: Self = StObject.set(x, "ClientConnectOptions", js.undefined)
    
    inline def setClientLoginBannerOptions(value: ClientLoginBannerOptions): Self = StObject.set(x, "ClientLoginBannerOptions", value.asInstanceOf[js.Any])
    
    inline def setClientLoginBannerOptionsUndefined: Self = StObject.set(x, "ClientLoginBannerOptions", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setConnectionLogOptions(value: ConnectionLogOptions): Self = StObject.set(x, "ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsServers(value: ValueStringList): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    inline def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    inline def setDnsServersVarargs(value: String*): Self = StObject.set(x, "DnsServers", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSelfServicePortal(value: SelfServicePortal): Self = StObject.set(x, "SelfServicePortal", value.asInstanceOf[js.Any])
    
    inline def setSelfServicePortalUndefined: Self = StObject.set(x, "SelfServicePortal", js.undefined)
    
    inline def setServerCertificateArn(value: String): Self = StObject.set(x, "ServerCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutHours(value: Integer): Self = StObject.set(x, "SessionTimeoutHours", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutHoursUndefined: Self = StObject.set(x, "SessionTimeoutHours", js.undefined)
    
    inline def setSplitTunnel(value: Boolean): Self = StObject.set(x, "SplitTunnel", value.asInstanceOf[js.Any])
    
    inline def setSplitTunnelUndefined: Self = StObject.set(x, "SplitTunnel", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTransportProtocol(value: TransportProtocol): Self = StObject.set(x, "TransportProtocol", value.asInstanceOf[js.Any])
    
    inline def setTransportProtocolUndefined: Self = StObject.set(x, "TransportProtocol", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpnPort(value: Integer): Self = StObject.set(x, "VpnPort", value.asInstanceOf[js.Any])
    
    inline def setVpnPortUndefined: Self = StObject.set(x, "VpnPort", js.undefined)
  }
}
