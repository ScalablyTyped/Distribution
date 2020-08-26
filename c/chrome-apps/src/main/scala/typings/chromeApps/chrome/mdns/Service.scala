package typings.chromeApps.chrome.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /** The IP address of an mDNS advertised service. */
  var ipAddress: String = js.native
  /** Metadata for an mDNS advertised service. */
  var serviceData: js.Array[String] = js.native
  /** The host:port pair of an mDNS advertised service. */
  var serviceHostPort: String = js.native
  /** The service name of an mDNS advertised service, .. */
  var serviceName: String = js.native
}

object Service {
  @scala.inline
  def apply(ipAddress: String, serviceData: js.Array[String], serviceHostPort: String, serviceName: String): Service = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceHostPort = serviceHostPort.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceDataVarargs(value: String*): Self = this.set("serviceData", js.Array(value :_*))
    @scala.inline
    def setServiceData(value: js.Array[String]): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceHostPort(value: String): Self = this.set("serviceHostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
  
}

