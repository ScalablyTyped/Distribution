package typings.chromeDashApps.chrome.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mdns.forceDiscovery")
@js.native
object forceDiscovery extends js.Object {
  /**
    * Immediately issues a multicast DNS query for all service types.
    * |callback| is invoked immediately.
    * At a later time, queries will be sent,
    * and any service events will be fired.
    * @since Chrome 45.
    * @param callback Callback invoked after ForceDiscovery() has started.
    */
  def apply(callback: js.Function0[Unit]): Unit = js.native
}

