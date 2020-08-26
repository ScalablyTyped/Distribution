package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcInterfaceRequest extends js.Object {
  /**
    * The name of the VPC Interface. This value must be unique within the current flow.
    */
  var Name: string = js.native
  /**
    * Role Arn MediaConnect can assumes to create ENIs in customer's account
    */
  var RoleArn: string = js.native
  /**
    * Security Group IDs to be used on ENI.
    */
  var SecurityGroupIds: listOfString = js.native
  /**
    * Subnet must be in the AZ of the Flow
    */
  var SubnetId: string = js.native
}

object VpcInterfaceRequest {
  @scala.inline
  def apply(Name: string, RoleArn: string, SecurityGroupIds: listOfString, SubnetId: string): VpcInterfaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcInterfaceRequest]
  }
  @scala.inline
  implicit class VpcInterfaceRequestOps[Self <: VpcInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: listOfString): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: string): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
  }
  
}

