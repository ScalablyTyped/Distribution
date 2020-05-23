package typings.consul.mod.Acl

import typings.consul.mod.CommonOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends CommonOptions {
  var id: String
}

object InfoOptions {
  @scala.inline
  def apply(
    id: String,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): InfoOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.get.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoOptions]
  }
}

