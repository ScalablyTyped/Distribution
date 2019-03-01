package typings
package datadogDashTracerLib.datadogDashTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracerOptions extends js.Object {
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var service: java.lang.String
}

object TracerOptions {
  @scala.inline
  def apply(
    service: java.lang.String,
    endpoint: java.lang.String = null,
    hostname: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("service")(service)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[TracerOptions]
  }
}

