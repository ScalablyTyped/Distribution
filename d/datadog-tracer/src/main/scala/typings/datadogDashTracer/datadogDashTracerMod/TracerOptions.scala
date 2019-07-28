package typings.datadogDashTracer.datadogDashTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracerOptions extends js.Object {
  var endpoint: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var service: String
}

object TracerOptions {
  @scala.inline
  def apply(
    service: String,
    endpoint: String = null,
    hostname: String = null,
    port: Int | Double = null,
    protocol: String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal(service = service)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[TracerOptions]
  }
}

