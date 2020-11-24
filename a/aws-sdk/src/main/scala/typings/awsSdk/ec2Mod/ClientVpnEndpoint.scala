package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnEndpoint extends js.Object {
  
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
  implicit class ClientVpnEndpointOps[Self <: ClientVpnEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAssociatedTargetNetworksVarargs(value: AssociatedTargetNetwork*): Self = this.set("AssociatedTargetNetworks", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedTargetNetworks(value: AssociatedTargetNetworkSet): Self = this.set("AssociatedTargetNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedTargetNetworks: Self = this.set("AssociatedTargetNetworks", js.undefined)
    
    @scala.inline
    def setAuthenticationOptionsVarargs(value: ClientVpnAuthentication*): Self = this.set("AuthenticationOptions", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticationOptions(value: ClientVpnAuthenticationList): Self = this.set("AuthenticationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationOptions: Self = this.set("AuthenticationOptions", js.undefined)
    
    @scala.inline
    def setClientCidrBlock(value: String): Self = this.set("ClientCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCidrBlock: Self = this.set("ClientCidrBlock", js.undefined)
    
    @scala.inline
    def setClientConnectOptions(value: ClientConnectResponseOptions): Self = this.set("ClientConnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientConnectOptions: Self = this.set("ClientConnectOptions", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setConnectionLogOptions(value: ConnectionLogResponseOptions): Self = this.set("ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionLogOptions: Self = this.set("ConnectionLogOptions", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: String): Self = this.set("DeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionTime: Self = this.set("DeletionTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = this.set("DnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: ValueStringList): Self = this.set("DnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsServers: Self = this.set("DnsServers", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSelfServicePortalUrl(value: String): Self = this.set("SelfServicePortalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfServicePortalUrl: Self = this.set("SelfServicePortalUrl", js.undefined)
    
    @scala.inline
    def setServerCertificateArn(value: String): Self = this.set("ServerCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateArn: Self = this.set("ServerCertificateArn", js.undefined)
    
    @scala.inline
    def setSplitTunnel(value: Boolean): Self = this.set("SplitTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitTunnel: Self = this.set("SplitTunnel", js.undefined)
    
    @scala.inline
    def setStatus(value: ClientVpnEndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
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
    
    @scala.inline
    def setVpnProtocol(value: VpnProtocol): Self = this.set("VpnProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnProtocol: Self = this.set("VpnProtocol", js.undefined)
  }
}
