package typings.awsSdkClientLambdaNode.typesVpcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledVpcConfig extends VpcConfig {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  @JSName("SecurityGroupIds")
  var SecurityGroupIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  @JSName("SubnetIds")
  var SubnetIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledVpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: js.Array[String] = null, SubnetIds: js.Array[String] = null): UnmarshalledVpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledVpcConfig]
  }
}

