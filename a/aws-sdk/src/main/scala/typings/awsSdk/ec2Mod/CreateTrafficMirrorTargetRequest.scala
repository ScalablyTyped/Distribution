package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorTargetRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The description of the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The network interface ID that is associated with the target.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.native
  /**
    * The tags to assign to the Traffic Mirror target.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateTrafficMirrorTargetRequest {
  @scala.inline
  def apply(
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    NetworkInterfaceId: NetworkInterfaceId = null,
    NetworkLoadBalancerArn: String = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateTrafficMirrorTargetRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NetworkLoadBalancerArn != null) __obj.updateDynamic("NetworkLoadBalancerArn")(NetworkLoadBalancerArn.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorTargetRequest]
  }
}

