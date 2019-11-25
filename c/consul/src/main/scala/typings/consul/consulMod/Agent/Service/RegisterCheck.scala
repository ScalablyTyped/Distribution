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
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCheck]
  }
}

