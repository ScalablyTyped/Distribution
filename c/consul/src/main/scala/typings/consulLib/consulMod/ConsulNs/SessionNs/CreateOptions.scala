package typings
package consulLib.consulMod.ConsulNs.SessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var behavior: js.UndefOr[java.lang.String] = js.undefined
  var checks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var lockdelay: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var node: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[java.lang.String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    behavior: java.lang.String = null,
    checks: js.Array[java.lang.String] = null,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    lockdelay: java.lang.String = null,
    name: java.lang.String = null,
    node: java.lang.String = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    ttl: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
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

