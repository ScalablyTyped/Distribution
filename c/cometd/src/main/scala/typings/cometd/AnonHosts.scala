package typings.cometd

import typings.cometd.mod.ReconnectAdvice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHosts extends js.Object {
  var hosts: js.UndefOr[js.Array[String]] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var `multiple-clients`: js.UndefOr[Boolean] = js.undefined
  var reconnect: js.UndefOr[ReconnectAdvice] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonHosts {
  @scala.inline
  def apply(
    hosts: js.Array[String] = null,
    interval: Int | Double = null,
    `multiple-clients`: js.UndefOr[Boolean] = js.undefined,
    reconnect: ReconnectAdvice = null,
    timeout: Int | Double = null
  ): AnonHosts = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(`multiple-clients`)) __obj.updateDynamic("multiple-clients")(`multiple-clients`.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHosts]
  }
}

