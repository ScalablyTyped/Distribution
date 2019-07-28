package typings.consul.consulMod.AgentNs.ServiceNs

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends CommonOptions {
  var address: js.UndefOr[String] = js.undefined
  var check: js.UndefOr[RegisterCheck] = js.undefined
  var checks: js.UndefOr[js.Array[RegisterCheck]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: String
  var port: js.UndefOr[Double] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    name: String,
    address: String = null,
    check: RegisterCheck = null,
    checks: js.Array[RegisterCheck] = null,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    id: String = null,
    port: Int | Double = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
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

