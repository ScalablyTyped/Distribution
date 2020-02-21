package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupDetails extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.native
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.native
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupDetails {
  @scala.inline
  def apply(
    GroupId: NonEmptyString = null,
    GroupName: NonEmptyString = null,
    IpPermissions: AwsEc2SecurityGroupIpPermissionList = null,
    IpPermissionsEgress: AwsEc2SecurityGroupIpPermissionList = null,
    OwnerId: NonEmptyString = null,
    VpcId: NonEmptyString = null
  ): AwsEc2SecurityGroupDetails = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions.asInstanceOf[js.Any])
    if (IpPermissionsEgress != null) __obj.updateDynamic("IpPermissionsEgress")(IpPermissionsEgress.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupDetails]
  }
}

