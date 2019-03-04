package typings
package consulLib.consulMod.ConsulNs.KvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var recurse: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("wait")
  var wait_FGetOptions: js.UndefOr[java.lang.String] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    index: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    recurse: js.UndefOr[scala.Boolean] = js.undefined,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
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

