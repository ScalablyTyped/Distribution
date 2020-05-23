package typings.cometd.anon

import typings.cometd.mod.ReconnectAdvice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hosts extends js.Object {
  var hosts: js.UndefOr[js.Array[String]] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var `multiple-clients`: js.UndefOr[Boolean] = js.undefined
  var reconnect: js.UndefOr[ReconnectAdvice] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Hosts {
  @scala.inline
  def apply(
    hosts: js.Array[String] = null,
    interval: js.UndefOr[Double] = js.undefined,
    `multiple-clients`: js.UndefOr[Boolean] = js.undefined,
    reconnect: ReconnectAdvice = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Hosts = {
    val __obj = js.Dynamic.literal()
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`multiple-clients`)) __obj.updateDynamic("multiple-clients")(`multiple-clients`.get.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosts]
  }
}

