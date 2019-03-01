package typings
package consulLib.consulMod.ConsulNs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FireOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var name: java.lang.String
  var node: js.UndefOr[java.lang.String] = js.undefined
  var payload: java.lang.String | nodeLib.Buffer
  var service: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object FireOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    payload: java.lang.String | nodeLib.Buffer,
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    node: java.lang.String = null,
    service: java.lang.String = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
  ): FireOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
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

