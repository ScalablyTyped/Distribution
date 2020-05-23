package typings.datadogTracer.mod

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
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracerOptions]
  }
}

