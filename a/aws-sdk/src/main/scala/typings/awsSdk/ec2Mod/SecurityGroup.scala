package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroup extends js.Object {
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.native
  /**
    * The inbound rules associated with the security group.
    */
  var IpPermissions: js.UndefOr[IpPermissionList] = js.native
  /**
    * [VPC only] The outbound rules associated with the security group.
    */
  var IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.native
  /**
    * The AWS account ID of the owner of the security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * [VPC only] The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object SecurityGroup {
  @scala.inline
  def apply(
    Description: String = null,
    GroupId: String = null,
    GroupName: String = null,
    IpPermissions: IpPermissionList = null,
    IpPermissionsEgress: IpPermissionList = null,
    OwnerId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (IpPermissions != null) __obj.updateDynamic("IpPermissions")(IpPermissions.asInstanceOf[js.Any])
    if (IpPermissionsEgress != null) __obj.updateDynamic("IpPermissionsEgress")(IpPermissionsEgress.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroup]
  }
}

