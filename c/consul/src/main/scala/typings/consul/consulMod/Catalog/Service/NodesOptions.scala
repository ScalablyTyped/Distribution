package typings.consul.consulMod.Catalog.Service

import typings.consul.consulMod.CommonOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesOptions extends CommonOptions {
  var service: String
  var tag: js.UndefOr[String] = js.undefined
}

object NodesOptions {
  @scala.inline
  def apply(
    service: String,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): NodesOptions = {
    val __obj = js.Dynamic.literal(service = service)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[NodesOptions]
  }
}

