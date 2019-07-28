package typings.consul.consulMod.SessionNs

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends CommonOptions {
  var behavior: js.UndefOr[String] = js.undefined
  var checks: js.UndefOr[js.Array[String]] = js.undefined
  var lockdelay: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var node: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    behavior: String = null,
    checks: js.Array[String] = null,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    lockdelay: String = null,
    name: String = null,
    node: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    ttl: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (checks != null) __obj.updateDynamic("checks")(checks)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (lockdelay != null) __obj.updateDynamic("lockdelay")(lockdelay)
    if (name != null) __obj.updateDynamic("name")(name)
    if (node != null) __obj.updateDynamic("node")(node)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[CreateOptions]
  }
}

