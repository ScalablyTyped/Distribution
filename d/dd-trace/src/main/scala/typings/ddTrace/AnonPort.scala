package typings.ddTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  /**
    * The port of the Dogstatsd agent that the metrics will submitted to.
    * @default 8125
    */
  var port: js.UndefOr[Double] = js.undefined
}

object AnonPort {
  @scala.inline
  def apply(port: Int | Double = null): AnonPort = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}

