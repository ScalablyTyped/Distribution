package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeSecurityGroupIngressRequest extends js.Object {
  /**
    * The CIDR IP address range. You can't specify this parameter when specifying a source security group.
    */
  var CidrIp: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP type number. For the ICMP type number, use -1 to specify all ICMP types.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The ID of the security group. You must specify either the security group ID or the security group name in the request. For security groups in a nondefault VPC, you must specify the security group ID.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the security group. You must specify either the security group ID or the security group name in the request.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  /**
    * The sets of IP permissions. You can't specify a source security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers). Use -1 to specify all.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * [EC2-Classic, default VPC] The name of the source security group. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the start of the port range, the IP protocol, and the end of the port range. For EC2-VPC, the source security group must be in the same VPC. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * [EC2-Classic] The AWS account ID of the source security group, if the source security group is in a different account. You can't specify this parameter in combination with the following parameters: the CIDR IP address range, the IP protocol, the start of the port range, and the end of the port range. To revoke a specific rule for an IP protocol and port range, use a set of IP permissions instead.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP code number. For the ICMP code number, use -1 to specify all ICMP codes for the ICMP type.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object RevokeSecurityGroupIngressRequest {
  @scala.inline
  def apply(): RevokeSecurityGroupIngressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeSecurityGroupIngressRequest]
  }
  @scala.inline
  implicit class RevokeSecurityGroupIngressRequestOps[Self <: RevokeSecurityGroupIngressRequest] (val x: Self) extends AnyVal {
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
    def setCidrIp(value: String): Self = this.set("CidrIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrIp: Self = this.set("CidrIp", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setFromPort(value: Integer): Self = this.set("FromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("FromPort", js.undefined)
    @scala.inline
    def setGroupId(value: SecurityGroupId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setGroupName(value: SecurityGroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setIpPermissionsVarargs(value: IpPermission*): Self = this.set("IpPermissions", js.Array(value :_*))
    @scala.inline
    def setIpPermissions(value: IpPermissionList): Self = this.set("IpPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpPermissions: Self = this.set("IpPermissions", js.undefined)
    @scala.inline
    def setIpProtocol(value: String): Self = this.set("IpProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpProtocol: Self = this.set("IpProtocol", js.undefined)
    @scala.inline
    def setSourceSecurityGroupName(value: String): Self = this.set("SourceSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSecurityGroupName: Self = this.set("SourceSecurityGroupName", js.undefined)
    @scala.inline
    def setSourceSecurityGroupOwnerId(value: String): Self = this.set("SourceSecurityGroupOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSecurityGroupOwnerId: Self = this.set("SourceSecurityGroupOwnerId", js.undefined)
    @scala.inline
    def setToPort(value: Integer): Self = this.set("ToPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("ToPort", js.undefined)
  }
  
}

