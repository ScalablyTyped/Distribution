package typings.chromeDashApps.chrome.networking.onc

import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.networking.onc._internal_.ObjectFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFiProperties[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L] extends WiFiPropertiesBase[M, String | ManagedDOMString] {
  /**
    * Whether ARP polling of default gateway is allowed.
    * @default true
    */
  var AllowGatewayARPPolling: js.UndefOr[B] = js.undefined
  /** Whether the WiFi network should be connected automatically when in range. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  /** The network EAP properties. Required for WEP-8021X and WPA-EAP networks. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  /** Contains all operating frequency recently seen for the WiFi network. */
  var FrequencyList: js.UndefOr[js.Array[integer]] = js.undefined
  /** Whether the network SSID will be broadcast. */
  var HiddenSSID: js.UndefOr[B] = js.undefined
  /**
    * @since Chrome 66.
    * The passphrase for WEP/WPA/WPA2 connections.
    * *This property can only be set!*
    */
  var Passphrase: js.UndefOr[String] = js.undefined
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.undefined
}

object WiFiProperties {
  @scala.inline
  def apply[M /* <: ManagedObject */, OF /* <: ObjectFunction */, B, S, L](
    AllowGatewayARPPolling: B = null,
    AutoConnect: B = null,
    BSSID: String = null,
    EAP: EAPProperties = null,
    Frequency: Int | Double = null,
    FrequencyList: js.Array[integer] = null,
    HexSSID: String | ManagedDOMString = null,
    HiddenSSID: B = null,
    Passphrase: String = null,
    RoamTreshold: L = null,
    SSID: String | ManagedDOMString = null,
    Security: String | ManagedDOMString = null,
    SignalStrength: Int | Double = null,
    TetheringState: String = null
  ): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    if (AllowGatewayARPPolling != null) __obj.updateDynamic("AllowGatewayARPPolling")(AllowGatewayARPPolling.asInstanceOf[js.Any])
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (EAP != null) __obj.updateDynamic("EAP")(EAP.asInstanceOf[js.Any])
    if (Frequency != null) __obj.updateDynamic("Frequency")(Frequency.asInstanceOf[js.Any])
    if (FrequencyList != null) __obj.updateDynamic("FrequencyList")(FrequencyList.asInstanceOf[js.Any])
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID.asInstanceOf[js.Any])
    if (HiddenSSID != null) __obj.updateDynamic("HiddenSSID")(HiddenSSID.asInstanceOf[js.Any])
    if (Passphrase != null) __obj.updateDynamic("Passphrase")(Passphrase.asInstanceOf[js.Any])
    if (RoamTreshold != null) __obj.updateDynamic("RoamTreshold")(RoamTreshold.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (Security != null) __obj.updateDynamic("Security")(Security.asInstanceOf[js.Any])
    if (SignalStrength != null) __obj.updateDynamic("SignalStrength")(SignalStrength.asInstanceOf[js.Any])
    if (TetheringState != null) __obj.updateDynamic("TetheringState")(TetheringState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
}

