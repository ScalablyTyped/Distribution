package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputVpcRequest extends js.Object {
  /**
    * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC network interfaces.
  Requires subnetIds. If none are specified then the VPC default security group will be used.
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.native
  /**
    * A list of 2 VPC subnet IDs from the same VPC.
  Subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: listOfString = js.native
}

object InputVpcRequest {
  @scala.inline
  def apply(SubnetIds: listOfString, SecurityGroupIds: listOfString = null): InputVpcRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVpcRequest]
  }
}

