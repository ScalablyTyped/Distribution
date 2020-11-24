package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientVpnEndpointRequest extends js.Object {
  
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  var AuthenticationOptions: ClientVpnAuthenticationRequestList = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  var ClientCidrBlock: String = js.native
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientConnectOptions] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: typings.awsSdk.ec2Mod.ConnectionLogOptions = js.native
  
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.native
  
  /**
    * Specify whether to enable the self-service portal for the Client VPN endpoint. Default Value: enabled 
    */
  var SelfServicePortal: js.UndefOr[typings.awsSdk.ec2Mod.SelfServicePortal] = js.native
  
  /**
    * The ARN of the server certificate. For more information, see the AWS Certificate Manager User Guide.
    */
  var ServerCertificateArn: String = js.native
  
  /**
    * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. By default, split-tunnel on a VPN endpoint is disabled. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags to apply to the Client VPN endpoint during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The transport protocol to be used by the VPN session. Default value: udp 
    */
  var TransportProtocol: js.UndefOr[typings.awsSdk.ec2Mod.TransportProtocol] = js.native
  
  /**
    * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
  
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.native
}
object CreateClientVpnEndpointRequest {
  
  @scala.inline
  def apply(
    AuthenticationOptions: ClientVpnAuthenticationRequestList,
    ClientCidrBlock: String,
    ConnectionLogOptions: ConnectionLogOptions,
    ServerCertificateArn: String
  ): CreateClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(AuthenticationOptions = AuthenticationOptions.asInstanceOf[js.Any], ClientCidrBlock = ClientCidrBlock.asInstanceOf[js.Any], ConnectionLogOptions = ConnectionLogOptions.asInstanceOf[js.Any], ServerCertificateArn = ServerCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointRequest]
  }
  
  @scala.inline
  implicit class CreateClientVpnEndpointRequestOps[Self <: CreateClientVpnEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationOptionsVarargs(value: ClientVpnAuthenticationRequest*): Self = this.set("AuthenticationOptions", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationOptions(value: ClientVpnAuthenticationRequestList): Self = this.set("AuthenticationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCidrBlock(value: String): Self = this.set("ClientCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionLogOptions(value: ConnectionLogOptions): Self = this.set("ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArn(value: String): Self = this.set("ServerCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConnectOptions(value: ClientConnectOptions): Self = this.set("ClientConnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientConnectOptions: Self = this.set("ClientConnectOptions", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = this.set("DnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: ValueStringList): Self = this.set("DnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsServers: Self = this.set("DnsServers", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSelfServicePortal(value: SelfServicePortal): Self = this.set("SelfServicePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfServicePortal: Self = this.set("SelfServicePortal", js.undefined)
    
    @scala.inline
    def setSplitTunnel(value: Boolean): Self = this.set("SplitTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitTunnel: Self = this.set("SplitTunnel", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
    
    @scala.inline
    def setTransportProtocol(value: TransportProtocol): Self = this.set("TransportProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportProtocol: Self = this.set("TransportProtocol", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    
    @scala.inline
    def setVpnPort(value: Integer): Self = this.set("VpnPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnPort: Self = this.set("VpnPort", js.undefined)
  }
}
