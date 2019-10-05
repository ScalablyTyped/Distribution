package typings.consul.consulMod.Agent.Check

import typings.consul.consulMod.CommonOptions
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
    timeout: Int | Double = null,
    token: String = null,
    ttl: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (http != null) __obj.updateDynamic("http")(http)
    if (id != null) __obj.updateDynamic("id")(id)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (script != null) __obj.updateDynamic("script")(script)
    if (serviceid != null) __obj.updateDynamic("serviceid")(serviceid)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[RegisterOptions]
  }
}

