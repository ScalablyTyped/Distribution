package typings.bonjour.mod

import typings.bonjour.bonjourStrings.udp4
import typings.bonjour.bonjourStrings.udp6
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
  var `type`: js.UndefOr[udp4 | udp6] = js.undefined
}

object BonjourOptions {
  @scala.inline
  def apply(
    interface: String = null,
    ip: String = null,
    loopback: js.UndefOr[Boolean] = js.undefined,
    multicast: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    reuseAddr: js.UndefOr[Boolean] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    `type`: udp4 | udp6 = null
  ): BonjourOptions = {
    val __obj = js.Dynamic.literal()
    if (interface != null) __obj.updateDynamic("interface")(interface.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (!js.isUndefined(loopback)) __obj.updateDynamic("loopback")(loopback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multicast)) __obj.updateDynamic("multicast")(multicast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourOptions]
  }
}

