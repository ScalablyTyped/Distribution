package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupReference extends js.Object {
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object SecurityGroupReference {
  @scala.inline
  def apply(GroupId: String = null, ReferencingVpcId: String = null, VpcPeeringConnectionId: String = null): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (ReferencingVpcId != null) __obj.updateDynamic("ReferencingVpcId")(ReferencingVpcId.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupReference]
  }
}

