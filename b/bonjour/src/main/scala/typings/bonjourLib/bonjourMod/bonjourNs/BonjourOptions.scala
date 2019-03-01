package typings
package bonjourLib.bonjourMod.bonjourNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BonjourOptions extends js.Object {
  var interface: js.UndefOr[java.lang.String] = js.undefined
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var loopback: js.UndefOr[scala.Boolean] = js.undefined
  var multicast: js.UndefOr[scala.Boolean] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var reuseAddr: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object BonjourOptions {
  @scala.inline
  def apply(
    interface: java.lang.String = null,
    ip: java.lang.String = null,
    loopback: js.UndefOr[scala.Boolean] = js.undefined,
    multicast: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    reuseAddr: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null
  ): BonjourOptions = {
    val __obj = js.Dynamic.literal()
    if (interface != null) __obj.updateDynamic("interface")(interface)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (!js.isUndefined(loopback)) __obj.updateDynamic("loopback")(loopback)
    if (!js.isUndefined(multicast)) __obj.updateDynamic("multicast")(multicast)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourOptions]
  }
}

