package typings.bunnymq.bunnymqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var routingKey: js.UndefOr[String] = js.undefined
  var rpc: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(routingKey: String = null, rpc: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey)
    if (!js.isUndefined(rpc)) __obj.updateDynamic("rpc")(rpc)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

