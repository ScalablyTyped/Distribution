package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreVpcConfigResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledVpcConfigResponse extends _VpcConfigResponse {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  @JSName("SecurityGroupIds")
  var SecurityGroupIds__UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  @JSName("SubnetIds")
  var SubnetIds__UnmarshalledVpcConfigResponse: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledVpcConfigResponse {
  @scala.inline
  def apply(
    SecurityGroupIds: js.Array[String] = null,
    SubnetIds: js.Array[String] = null,
    VpcId: String = null
  ): _UnmarshalledVpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledVpcConfigResponse]
  }
}

