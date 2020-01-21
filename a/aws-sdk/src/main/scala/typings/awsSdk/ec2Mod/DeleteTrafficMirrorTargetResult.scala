package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorTargetResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorTargetResult {
  @scala.inline
  def apply(TrafficMirrorTargetId: String = null): DeleteTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorTargetResult]
  }
}

