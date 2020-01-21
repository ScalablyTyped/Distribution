package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2SecurityGroup extends js.Object {
  /**
    * The name of the Amazon EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the Amazon EC2 security group owner.
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  /**
    * The status of the Amazon EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
}

object EC2SecurityGroup {
  @scala.inline
  def apply(EC2SecurityGroupName: String = null, EC2SecurityGroupOwnerId: String = null, Status: String = null): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (EC2SecurityGroupName != null) __obj.updateDynamic("EC2SecurityGroupName")(EC2SecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroupOwnerId != null) __obj.updateDynamic("EC2SecurityGroupOwnerId")(EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2SecurityGroup]
  }
}

