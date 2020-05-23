package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorTargetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: typings.awsSdk.ec2Mod.TrafficMirrorTargetId = js.native
}

object DeleteTrafficMirrorTargetRequest {
  @scala.inline
  def apply(TrafficMirrorTargetId: TrafficMirrorTargetId, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteTrafficMirrorTargetRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorTargetId = TrafficMirrorTargetId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorTargetRequest]
  }
}

