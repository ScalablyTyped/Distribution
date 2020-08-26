package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellularBase extends js.Object {
  /** Carrier account activation state. */
  var ActivationState: js.UndefOr[ActivationStateType] = js.native
  /** If the modem is registered on a network, the network technology currently in use. */
  var NetworkTechnology: js.UndefOr[String] = js.native
  /** The roaming state of the cellular modem on the current network. */
  var RoamingState: js.UndefOr[String] = js.native
  /** Whether a SIM card is present. */
  var SIMPresent: js.UndefOr[Boolean] = js.native
  /** The current network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
}

object CellularBase {
  @scala.inline
  def apply(): CellularBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularBase]
  }
  @scala.inline
  implicit class CellularBaseOps[Self <: CellularBase] (val x: Self) extends AnyVal {
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
    def setActivationState(value: ActivationStateType): Self = this.set("ActivationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationState: Self = this.set("ActivationState", js.undefined)
    @scala.inline
    def setNetworkTechnology(value: String): Self = this.set("NetworkTechnology", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkTechnology: Self = this.set("NetworkTechnology", js.undefined)
    @scala.inline
    def setRoamingState(value: String): Self = this.set("RoamingState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoamingState: Self = this.set("RoamingState", js.undefined)
    @scala.inline
    def setSIMPresent(value: Boolean): Self = this.set("SIMPresent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIMPresent: Self = this.set("SIMPresent", js.undefined)
    @scala.inline
    def setSignalStrength(value: integer): Self = this.set("SignalStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalStrength: Self = this.set("SignalStrength", js.undefined)
  }
  
}

