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
}

