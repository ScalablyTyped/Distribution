package typings.bonjour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BonjourOptions extends js.Object {
  var interface: js.UndefOr[String] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var loopback: js.UndefOr[Boolean] = js.undefined
  var multicast: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reuseAddr: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object BonjourOptions {
  @scala.inline
  def apply(
    interface: String = null,
    ip: String = null,
    loopback: js.UndefOr[Boolean] = js.undefined,
    multicast: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    reuseAddr: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): BonjourOptions = {
    val __obj = js.Dynamic.literal()
    if (interface != null) __obj.updateDynamic("interface")(interface.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (!js.isUndefined(loopback)) __obj.updateDynamic("loopback")(loopback.asInstanceOf[js.Any])
    if (!js.isUndefined(multicast)) __obj.updateDynamic("multicast")(multicast.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourOptions]
  }
}

