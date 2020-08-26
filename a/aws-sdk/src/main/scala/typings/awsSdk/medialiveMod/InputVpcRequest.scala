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
  def apply(SubnetIds: listOfString): InputVpcRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputVpcRequest]
  }
  @scala.inline
  implicit class InputVpcRequestOps[Self <: InputVpcRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: listOfString): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: listOfString): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
  }
  
}

