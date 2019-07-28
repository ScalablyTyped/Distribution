package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import typings.chromeDashApps.chromeNs.integer
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
  def apply(Host: String = null, Port: js.UndefOr[integer] = js.undefined): ProxyLocation = {
    val __obj = js.Dynamic.literal()
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[ProxyLocation]
  }
}

