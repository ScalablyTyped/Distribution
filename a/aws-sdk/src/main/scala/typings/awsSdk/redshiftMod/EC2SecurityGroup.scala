package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the EC2 Security Group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The status of the EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the EC2 security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object EC2SecurityGroup {
  @scala.inline
  def apply(
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null,
    Status: String = null,
    Tags: TagList = null
  ): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

