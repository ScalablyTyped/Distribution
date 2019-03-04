package typings
package consulLib.consulMod.ConsulNs.HealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var near: js.UndefOr[java.lang.String] = js.undefined
  var passing: js.UndefOr[scala.Boolean] = js.undefined
  var service: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    service: java.lang.String,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    near: java.lang.String = null,
    passing: js.UndefOr[scala.Boolean] = js.undefined,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
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

