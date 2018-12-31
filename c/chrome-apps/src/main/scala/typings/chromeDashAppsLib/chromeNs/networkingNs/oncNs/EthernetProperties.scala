package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EthernetProperties[M /* <: ManagedObject */] extends js.Object {
  /** The authentication used by the Ethernet network. Possible values are None and 8021X. */
  var Authentication: js.UndefOr[EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]] = js.undefined
  /** Whether the Ethernet network should be connected automatically. */
  var AutoConnect: js.UndefOr[scala.Boolean | ManagedBoolean] = js.undefined
  /** Network's EAP settings. Required for 8021X authentication. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
}

