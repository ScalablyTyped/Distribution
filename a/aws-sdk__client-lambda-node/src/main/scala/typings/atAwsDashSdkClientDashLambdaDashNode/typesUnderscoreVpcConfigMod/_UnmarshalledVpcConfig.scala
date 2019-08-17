package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledVpcConfig extends _VpcConfig {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  @JSName("SecurityGroupIds")
  var SecurityGroupIds__UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  @JSName("SubnetIds")
  var SubnetIds__UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledVpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: js.Array[String] = null, SubnetIds: js.Array[String] = null): _UnmarshalledVpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[_UnmarshalledVpcConfig]
  }
}

