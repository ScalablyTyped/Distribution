package typings.awsSdkClientLambdaNode.typesVpcConfigMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  var SecurityGroupIds: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  var SubnetIds: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
}

object VpcConfig {
  @scala.inline
  def apply(
    SecurityGroupIds: js.Array[String] | Iterable[String] = null,
    SubnetIds: js.Array[String] | Iterable[String] = null
  ): VpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
}

