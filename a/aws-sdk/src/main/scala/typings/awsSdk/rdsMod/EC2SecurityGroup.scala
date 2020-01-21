package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * Specifies the id of the EC2 security group.
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  Specifies the AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * Provides the status of the EC2 security group. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.native
}

object EC2SecurityGroup {
  @scala.inline
  def apply(
    EC2SecurityGroupId: String = null,
    EC2SecurityGroupName: String = null,
    EC2SecurityGroupOwnerId: String = null,
    Status: String = null
  ): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupId != null) __obj.updateDynamic("EC2SecurityGroupId")(EC2SecurityGroupId.asInstanceOf[js.Any])
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

