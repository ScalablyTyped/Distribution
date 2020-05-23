package typings.consul.mod.Agent.Check

import typings.consul.mod.CommonOptions
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends CommonOptions {
  var http: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var name: String
  var notes: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var serviceid: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[String] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(
    name: String,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    http: String = null,
    id: String = null,
    interval: String = null,
    notes: String = null,
    script: String = null,
    serviceid: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    status: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    token: String = null,
    ttl: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.get.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (serviceid != null) __obj.updateDynamic("serviceid")(serviceid.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOptions]
  }
}

