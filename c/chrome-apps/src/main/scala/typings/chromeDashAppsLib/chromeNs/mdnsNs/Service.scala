package typings
package chromeDashAppsLib.chromeNs.mdnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /** The IP address of an mDNS advertised service. */
  var ipAddress: java.lang.String
  /** Metadata for an mDNS advertised service. */
  var serviceData: js.Array[java.lang.String]
  /** The host:port pair of an mDNS advertised service. */
  var serviceHostPort: java.lang.String
  /** The service name of an mDNS advertised service, .. */
  var serviceName: java.lang.String
}

object Service {
  @scala.inline
  def apply(
    ipAddress: java.lang.String,
    serviceData: js.Array[java.lang.String],
    serviceHostPort: java.lang.String,
    serviceName: java.lang.String
  ): Service = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ipAddress")(ipAddress)
    __obj.updateDynamic("serviceData")(serviceData)
    __obj.updateDynamic("serviceHostPort")(serviceHostPort)
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Service]
  }
}

