package typings.consul.consulMod.KvNs

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends CommonOptions {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var key: String
  var raw: js.UndefOr[Boolean] = js.undefined
  var recurse: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FGetOptions: js.UndefOr[String] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    key: String,
    buffer: js.UndefOr[Boolean] = js.undefined,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    index: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    recurse: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): GetOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(recurse)) __obj.updateDynamic("recurse")(recurse)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[GetOptions]
  }
}

