package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AssociatedTargetNetworks: AssociatedTargetNetworkSet = null,
    AuthenticationOptions: ClientVpnAuthenticationList = null,
    ClientCidrBlock: String = null,
    ClientVpnEndpointId: String = null,
    ConnectionLogOptions: ConnectionLogResponseOptions = null,
    CreationTime: String = null,
    DeletionTime: String = null,
    Description: String = null,
    DnsName: String = null,
    DnsServers: ValueStringList = null,
    SecurityGroupIds: ClientVpnSecurityGroupIdSet = null,
    ServerCertificateArn: String = null,
    SplitTunnel: js.UndefOr[Boolean] = js.undefined,
    Status: ClientVpnEndpointStatus = null,
    Tags: TagList = null,
    TransportProtocol: TransportProtocol = null,
    VpcId: VpcId = null,
    VpnPort: js.UndefOr[Integer] = js.undefined,
    VpnProtocol: VpnProtocol = null
  ): ClientVpnEndpoint = {
    val __obj = js.Dynamic.literal()
    if (AssociatedTargetNetworks != null) __obj.updateDynamic("AssociatedTargetNetworks")(AssociatedTargetNetworks.asInstanceOf[js.Any])
    if (AuthenticationOptions != null) __obj.updateDynamic("AuthenticationOptions")(AuthenticationOptions.asInstanceOf[js.Any])
    if (ClientCidrBlock != null) __obj.updateDynamic("ClientCidrBlock")(ClientCidrBlock.asInstanceOf[js.Any])
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (ConnectionLogOptions != null) __obj.updateDynamic("ConnectionLogOptions")(ConnectionLogOptions.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (DnsServers != null) __obj.updateDynamic("DnsServers")(DnsServers.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (ServerCertificateArn != null) __obj.updateDynamic("ServerCertificateArn")(ServerCertificateArn.asInstanceOf[js.Any])
    if (!js.isUndefined(SplitTunnel)) __obj.updateDynamic("SplitTunnel")(SplitTunnel.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransportProtocol != null) __obj.updateDynamic("TransportProtocol")(TransportProtocol.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(VpnPort)) __obj.updateDynamic("VpnPort")(VpnPort.get.asInstanceOf[js.Any])
    if (VpnProtocol != null) __obj.updateDynamic("VpnProtocol")(VpnProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnEndpoint]
  }
}

