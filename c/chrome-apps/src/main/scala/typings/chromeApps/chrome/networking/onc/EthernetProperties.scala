package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthernetProperties[M /* <: ManagedObject */] extends js.Object {
  /** The authentication used by the Ethernet network. Possible values are None and 8021X. */
  var Authentication: js.UndefOr[EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]] = js.native
  /** Whether the Ethernet network should be connected automatically. */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.native
  /** Network's EAP settings. Required for 8021X authentication. */
  var EAP: js.UndefOr[EAPProperties] = js.native
}

object EthernetProperties {
  @scala.inline
  def apply[/* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M](): EthernetProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EthernetProperties[M]]
  }
  @scala.inline
  implicit class EthernetPropertiesOps[Self <: EthernetProperties[_], /* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M] (val x: Self with EthernetProperties[M]) extends AnyVal {
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
    def setAuthentication(value: EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]): Self = this.set("Authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("Authentication", js.undefined)
    @scala.inline
    def setAutoConnect(value: Boolean | ManagedBoolean): Self = this.set("AutoConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoConnect: Self = this.set("AutoConnect", js.undefined)
    @scala.inline
    def setEAP(value: EAPProperties): Self = this.set("EAP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEAP: Self = this.set("EAP", js.undefined)
  }
  
}

