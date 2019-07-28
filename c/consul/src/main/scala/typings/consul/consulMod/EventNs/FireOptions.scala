package typings.consul.consulMod.EventNs

import typings.consul.consulMod.CommonOptions
import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FireOptions extends CommonOptions {
  var name: String
  var node: js.UndefOr[String] = js.undefined
  var payload: String | Buffer
  var service: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object FireOptions {
  @scala.inline
  def apply(
    name: String,
    payload: String | Buffer,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    node: String = null,
    service: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): FireOptions = {
    val __obj = js.Dynamic.literal(name = name, payload = payload.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (node != null) __obj.updateDynamic("node")(node)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[FireOptions]
  }
}

