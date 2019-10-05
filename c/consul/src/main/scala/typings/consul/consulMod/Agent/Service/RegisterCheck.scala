package typings.consul.consulMod.Agent.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCheck extends js.Object {
  var http: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[String] = js.undefined
}

object RegisterCheck {
  @scala.inline
  def apply(
    http: String = null,
    interval: String = null,
    notes: String = null,
    script: String = null,
    status: String = null,
    ttl: String = null
  ): RegisterCheck = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (script != null) __obj.updateDynamic("script")(script)
    if (status != null) __obj.updateDynamic("status")(status)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[RegisterCheck]
  }
}

