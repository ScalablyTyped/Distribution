package typings
package consulLib.consulMod.AgentNs.CheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions
  extends consulLib.consulMod.CommonOptions {
  var http: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var script: js.UndefOr[java.lang.String] = js.undefined
  var serviceid: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[java.lang.String] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    http: java.lang.String = null,
    id: java.lang.String = null,
    interval: java.lang.String = null,
    notes: java.lang.String = null,
    script: java.lang.String = null,
    serviceid: java.lang.String = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    status: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    ttl: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (http != null) __obj.updateDynamic("http")(http)
    if (id != null) __obj.updateDynamic("id")(id)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (script != null) __obj.updateDynamic("script")(script)
    if (serviceid != null) __obj.updateDynamic("serviceid")(serviceid)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[RegisterOptions]
  }
}

