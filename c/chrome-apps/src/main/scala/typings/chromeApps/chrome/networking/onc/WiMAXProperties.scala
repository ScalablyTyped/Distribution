package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiMAXProperties[M /* <: ManagedObject */, B] extends js.Object {
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.native
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.native
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
}

object WiMAXProperties {
  @scala.inline
  def apply[/* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, B](): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
  @scala.inline
  implicit class WiMAXPropertiesOps[Self <: WiMAXProperties[_, _], /* <: typings.chromeApps.chrome.networking.onc.ManagedObject */ M, B] (val x: Self with (WiMAXProperties[M, B])) extends AnyVal {
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
    def setAutoConnect(value: B): Self = this.set("AutoConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoConnect: Self = this.set("AutoConnect", js.undefined)
    @scala.inline
    def setEAP(value: EAPProperties): Self = this.set("EAP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEAP: Self = this.set("EAP", js.undefined)
    @scala.inline
    def setSignalStrength(value: integer): Self = this.set("SignalStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalStrength: Self = this.set("SignalStrength", js.undefined)
  }
  
}

