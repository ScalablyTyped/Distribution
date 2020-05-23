package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeSecurityGroupEgressRequest extends js.Object {
  /**
    * Not supported. Use a set of IP permissions to specify the CIDR.
    */
  var CidrIp: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: SecurityGroupId = js.native
  /**
    * The sets of IP permissions. You can't specify a destination security group and a CIDR IP address range in the same set of permissions.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the protocol name or number.
    */
  var IpProtocol: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify a destination security group.
    */
  var SourceSecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * Not supported. Use a set of IP permissions to specify the port.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object AuthorizeSecurityGroupEgressRequest {
  @scala.inline
  def apply(
    GroupId: SecurityGroupId,
    CidrIp: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    FromPort: js.UndefOr[Integer] = js.undefined,
    IpPermissions: IpPermissionList = null,
    IpProtocol: String = null,
    SourceSecurityGroupName: String = null,
    SourceSecurityGroupOwnerId: String = null,
    ToPort: js.UndefOr[Integer] = js.undefined
  ): AuthorizeSecurityGroupEgressRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort.get.asInstanceOf[js.Any])
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions.asInstanceOf[js.Any])
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol.asInstanceOf[js.Any])
    if (SourceSecurityGroupName != null) __obj.updateDynamic("SourceSecurityGroupName")(SourceSecurityGroupName.asInstanceOf[js.Any])
    if (SourceSecurityGroupOwnerId != null) __obj.updateDynamic("SourceSecurityGroupOwnerId")(SourceSecurityGroupOwnerId.asInstanceOf[js.Any])
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeSecurityGroupEgressRequest]
  }
}

