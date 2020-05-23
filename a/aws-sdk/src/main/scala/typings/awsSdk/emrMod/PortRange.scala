package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.native
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port = js.native
}

object PortRange {
  @scala.inline
  def apply(MinRange: Port, MaxRange: js.UndefOr[Port] = js.undefined): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRange)) __obj.updateDynamic("MaxRange")(MaxRange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
}

