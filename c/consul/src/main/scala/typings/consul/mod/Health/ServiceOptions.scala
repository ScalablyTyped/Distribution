package typings.consul.mod.Health

import typings.consul.mod.CommonOptions
import typings.node.NodeJS.EventEmitter
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
    timeout: js.UndefOr[Double] = js.undefined,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.get.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (near != null) __obj.updateDynamic("near")(near.asInstanceOf[js.Any])
    if (!js.isUndefined(passing)) __obj.updateDynamic("passing")(passing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
}

