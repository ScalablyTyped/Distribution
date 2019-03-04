package typings
package consulLib.consulMod.ConsulNs.AgentNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var check: js.UndefOr[RegisterCheck] = js.undefined
  var checks: js.UndefOr[js.Array[RegisterCheck]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    address: java.lang.String = null,
    check: RegisterCheck = null,
    checks: js.Array[RegisterCheck] = null,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    id: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.Array[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (address != null) __obj.updateDynamic("address")(address)
    if (check != null) __obj.updateDynamic("check")(check)
    if (checks != null) __obj.updateDynamic("checks")(checks)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (id != null) __obj.updateDynamic("id")(id)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[RegisterOptions]
  }
}

