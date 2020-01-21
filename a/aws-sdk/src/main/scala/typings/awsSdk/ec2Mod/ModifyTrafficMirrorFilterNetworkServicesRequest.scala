package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterNetworkServicesRequest extends js.Object {
  /**
    * The network service, for example Amazon DNS, that you want to mirror.
    */
  var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The network service, for example Amazon DNS, that you no longer want to mirror.
    */
  var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object ModifyTrafficMirrorFilterNetworkServicesRequest {
  @scala.inline
  def apply(
    TrafficMirrorFilterId: TrafficMirrorFilterId,
    AddNetworkServices: TrafficMirrorNetworkServiceList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveNetworkServices: TrafficMirrorNetworkServiceList = null
  ): ModifyTrafficMirrorFilterNetworkServicesRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    if (AddNetworkServices != null) __obj.updateDynamic("AddNetworkServices")(AddNetworkServices.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (RemoveNetworkServices != null) __obj.updateDynamic("RemoveNetworkServices")(RemoveNetworkServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesRequest]
  }
}

