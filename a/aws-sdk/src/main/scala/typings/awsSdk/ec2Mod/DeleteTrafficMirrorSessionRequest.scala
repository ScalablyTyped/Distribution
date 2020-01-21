package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorSessionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typings.awsSdk.ec2Mod.TrafficMirrorSessionId = js.native
}

object DeleteTrafficMirrorSessionRequest {
  @scala.inline
  def apply(TrafficMirrorSessionId: TrafficMirrorSessionId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorSessionRequest]
  }
}

