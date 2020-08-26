package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClientVpnEndpointRequest extends js.Object {
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
  implicit class ModifyClientVpnEndpointRequestOps[Self <: ModifyClientVpnEndpointRequest] (val x: Self) extends AnyVal {
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
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionLogOptions(value: ConnectionLogOptions): Self = this.set("ConnectionLogOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionLogOptions: Self = this.set("ConnectionLogOptions", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDnsServers(value: DnsServersOptionsModifyStructure): Self = this.set("DnsServers", value.asInstanceOf[js.Any])
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
    def setServerCertificateArn(value: String): Self = this.set("ServerCertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerCertificateArn: Self = this.set("ServerCertificateArn", js.undefined)
    @scala.inline
    def setSplitTunnel(value: Boolean): Self = this.set("SplitTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitTunnel: Self = this.set("SplitTunnel", js.undefined)
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

