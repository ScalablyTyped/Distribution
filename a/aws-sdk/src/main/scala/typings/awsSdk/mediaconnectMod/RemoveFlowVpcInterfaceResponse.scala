package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowVpcInterfaceResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the VPC interface you removed.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * IDs of network interfaces associated with the removed VPC interface that Media Connect was unable to remove.
    */
  var NonDeletedNetworkInterfaceIds: js.UndefOr[listOfString] = js.native
  /**
    * The name of the VPC interface that was removed.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
}

object RemoveFlowVpcInterfaceResponse {
  @scala.inline
  def apply(
    FlowArn: string = null,
    NonDeletedNetworkInterfaceIds: listOfString = null,
    VpcInterfaceName: string = null
  ): RemoveFlowVpcInterfaceResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (NonDeletedNetworkInterfaceIds != null) __obj.updateDynamic("NonDeletedNetworkInterfaceIds")(NonDeletedNetworkInterfaceIds.asInstanceOf[js.Any])
    if (VpcInterfaceName != null) __obj.updateDynamic("VpcInterfaceName")(VpcInterfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowVpcInterfaceResponse]
  }
}

