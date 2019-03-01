package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

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
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (Port != null) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[ManagedProxyLocation]
  }
}

