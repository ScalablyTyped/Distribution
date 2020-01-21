package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[String] = js.undefined
  /** The port to use for the proxy */
  var Port: js.UndefOr[integer] = js.undefined
}

object ProxyLocation {
  @scala.inline
  def apply(Host: String = null, Port: Int | Double = null): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyLocation]
  }
}

