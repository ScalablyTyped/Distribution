package typings.consul.consulMod.HealthNs

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends CommonOptions {
  var near: js.UndefOr[String] = js.undefined
  var passing: js.UndefOr[Boolean] = js.undefined
  var service: String
  var tag: js.UndefOr[String] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    service: String,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    near: String = null,
    passing: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal(service = service)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (near != null) __obj.updateDynamic("near")(near)
    if (!js.isUndefined(passing)) __obj.updateDynamic("passing")(passing)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[ServiceOptions]
  }
}

