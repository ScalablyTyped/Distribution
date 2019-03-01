package typings
package consulLib.consulMod.ConsulNs.AgentNs.CheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarnOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var id: java.lang.String
  var note: js.UndefOr[java.lang.String] = js.undefined
}

object WarnOptions {
  @scala.inline
  def apply(
    id: java.lang.String,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    note: java.lang.String = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
  ): WarnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (note != null) __obj.updateDynamic("note")(note)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[WarnOptions]
  }
}

