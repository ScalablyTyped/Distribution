package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupUserIdGroupPair extends js.Object {
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of an AWS account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another AWS. 
    */
  var UserId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupUserIdGroupPair {
  @scala.inline
  def apply(
    GroupId: NonEmptyString = null,
    GroupName: NonEmptyString = null,
    PeeringStatus: NonEmptyString = null,
    UserId: NonEmptyString = null,
    VpcId: NonEmptyString = null,
    VpcPeeringConnectionId: NonEmptyString = null
  ): AwsEc2SecurityGroupUserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (PeeringStatus != null) __obj.updateDynamic("PeeringStatus")(PeeringStatus.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupUserIdGroupPair]
  }
}

