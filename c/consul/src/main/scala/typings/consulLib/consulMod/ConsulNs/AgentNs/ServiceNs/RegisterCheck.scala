package typings
package consulLib.consulMod.ConsulNs.AgentNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCheck extends js.Object {
  var http: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var script: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[java.lang.String] = js.undefined
}

object RegisterCheck {
  @scala.inline
  def apply(
    http: java.lang.String = null,
    interval: java.lang.String = null,
    notes: java.lang.String = null,
    script: java.lang.String = null,
    status: java.lang.String = null,
    ttl: java.lang.String = null
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

