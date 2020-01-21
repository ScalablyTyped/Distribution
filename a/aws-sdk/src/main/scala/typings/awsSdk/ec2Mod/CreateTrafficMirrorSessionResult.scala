package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorSessionResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorSession] = js.native
}

object CreateTrafficMirrorSessionResult {
  @scala.inline
  def apply(ClientToken: String = null, TrafficMirrorSession: TrafficMirrorSession = null): CreateTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (TrafficMirrorSession != null) __obj.updateDynamic("TrafficMirrorSession")(TrafficMirrorSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficMirrorSessionResult]
  }
}

