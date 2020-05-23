package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorPortRange extends js.Object {
  /**
    * The start of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  /**
    * The end of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}

object TrafficMirrorPortRange {
  @scala.inline
  def apply(FromPort: js.UndefOr[Integer] = js.undefined, ToPort: js.UndefOr[Integer] = js.undefined): TrafficMirrorPortRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorPortRange]
  }
}

