package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends js.Object {
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[String] = js.undefined
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[integer] = js.undefined
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.undefined
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.undefined
  /** The network security type. */
  var Security: js.UndefOr[S] = js.undefined
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[String] = js.undefined
}

object WiFiPropertiesBase {
  @scala.inline
  def apply[M /* <: ManagedObject */, S](
    BSSID: String = null,
    Frequency: js.UndefOr[integer] = js.undefined,
    HexSSID: S = null,
    SSID: S = null,
    Security: S = null,
    SignalStrength: js.UndefOr[integer] = js.undefined,
    TetheringState: String = null
  ): WiFiPropertiesBase[M, S] = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (!js.isUndefined(Frequency)) __obj.updateDynamic("Frequency")(Frequency)
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (Security != null) __obj.updateDynamic("Security")(Security.asInstanceOf[js.Any])
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    if (TetheringState != null) __obj.updateDynamic("TetheringState")(TetheringState)
    __obj.asInstanceOf[WiFiPropertiesBase[M, S]]
  }
}

