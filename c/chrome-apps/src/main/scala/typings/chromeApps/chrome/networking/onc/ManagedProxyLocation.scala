package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[ManagedDOMString] = js.undefined
  /** The port to use for the proxy */
  var Port: js.UndefOr[ManagedLong] = js.undefined
}

object ManagedProxyLocation {
  @scala.inline
  def apply(Host: ManagedDOMString = null, Port: ManagedLong = null): ManagedProxyLocation = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProxyLocation]
  }
}

