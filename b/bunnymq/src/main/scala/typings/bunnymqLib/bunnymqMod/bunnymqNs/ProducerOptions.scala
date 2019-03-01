package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var routingKey: js.UndefOr[java.lang.String] = js.undefined
  var rpc: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(
    routingKey: java.lang.String = null,
    rpc: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey)
    if (!js.isUndefined(rpc)) __obj.updateDynamic("rpc")(rpc)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

