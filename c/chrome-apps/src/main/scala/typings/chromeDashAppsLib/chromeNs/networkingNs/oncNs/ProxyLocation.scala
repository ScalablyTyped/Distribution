package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[java.lang.String] = js.undefined
  /** The port to use for the proxy */
  var Port: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object ProxyLocation {
  @scala.inline
  def apply(Host: java.lang.String = null, Port: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[ProxyLocation]
  }
}

