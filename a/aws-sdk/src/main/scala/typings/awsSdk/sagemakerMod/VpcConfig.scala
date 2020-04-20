package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfig extends js.Object {
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: VpcSecurityGroupIds = js.native
  /**
    * The ID of the subnets in the VPC to which you want to connect your training job or model. For information about the availability of specific instance types, see Supported Instance Types and Availability Zones.
    */
  var Subnets: typings.awsSdk.sagemakerMod.Subnets = js.native
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: VpcSecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
}

