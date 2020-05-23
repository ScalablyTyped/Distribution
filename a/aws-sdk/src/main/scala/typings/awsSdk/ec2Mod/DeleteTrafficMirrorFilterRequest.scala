package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorFilterRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object DeleteTrafficMirrorFilterRequest {
  @scala.inline
  def apply(TrafficMirrorFilterId: TrafficMirrorFilterId, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteTrafficMirrorFilterRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRequest]
  }
}

