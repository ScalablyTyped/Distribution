package typings.ddTrace.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  /**
    * The port of the Dogstatsd agent that the metrics will submitted to.
    * @default 8125
    */
  var port: js.UndefOr[Double] = js.undefined
}

object Port {
  @scala.inline
  def apply(port: js.UndefOr[Double] = js.undefined): Port = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

