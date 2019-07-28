package typings.consul.consulMod.KvNs

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelOptions extends CommonOptions {
  var cas: js.UndefOr[String] = js.undefined
  var key: String
  var recurse: js.UndefOr[Boolean] = js.undefined
}

object DelOptions {
  @scala.inline
  def apply(
    key: String,
    cas: String = null,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    recurse: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): DelOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (cas != null) __obj.updateDynamic("cas")(cas)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[DelOptions]
  }
}

