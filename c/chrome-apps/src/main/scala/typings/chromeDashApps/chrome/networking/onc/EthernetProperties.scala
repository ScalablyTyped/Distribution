package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EthernetProperties[M /* <: ManagedObject */] extends js.Object {
  /** The authentication used by the Ethernet network. Possible values are None and 8021X. */
  var Authentication: js.UndefOr[EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]] = js.undefined
  /** Whether the Ethernet network should be connected automatically. */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.undefined
  /** Network's EAP settings. Required for 8021X authentication. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
}

object EthernetProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */](
    Authentication: EthernetAuthenticationType | ManagedType[EthernetAuthenticationType] = null,
    AutoConnect: Boolean | ManagedBoolean = null,
    EAP: EAPProperties = null
  ): EthernetProperties[M] = {
    val __obj = js.Dynamic.literal()
    if (Authentication != null) __obj.updateDynamic("Authentication")(Authentication.asInstanceOf[js.Any])
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (EAP != null) __obj.updateDynamic("EAP")(EAP.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthernetProperties[M]]
  }
}

