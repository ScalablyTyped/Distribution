package typings.chromeDashApps.chromeNs.mdnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /** The IP address of an mDNS advertised service. */
  var ipAddress: String
  /** Metadata for an mDNS advertised service. */
  var serviceData: js.Array[String]
  /** The host:port pair of an mDNS advertised service. */
  var serviceHostPort: String
  /** The service name of an mDNS advertised service, .. */
  var serviceName: String
}

object Service {
  @scala.inline
  def apply(ipAddress: String, serviceData: js.Array[String], serviceHostPort: String, serviceName: String): Service = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress, serviceData = serviceData, serviceHostPort = serviceHostPort, serviceName = serviceName)
  
    __obj.asInstanceOf[Service]
  }
}

