package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorPortRangeRequest extends js.Object {
  /**
    * The first port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The last port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object TrafficMirrorPortRangeRequest {
  @scala.inline
  def apply(FromPort: js.UndefOr[Integer] = js.undefined, ToPort: js.UndefOr[Integer] = js.undefined): TrafficMirrorPortRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorPortRangeRequest]
  }
}

