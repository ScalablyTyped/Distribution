package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.ObjectFunction
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
    Frequency: js.UndefOr[integer] = js.undefined,
    FrequencyList: js.Array[integer] = null,
    HexSSID: String | ManagedDOMString = null,
    HiddenSSID: B = null,
    Passphrase: String = null,
    RoamTreshold: L = null,
    SSID: String | ManagedDOMString = null,
    Security: String | ManagedDOMString = null,
    SignalStrength: js.UndefOr[integer] = js.undefined,
    TetheringState: String = null
  ): WiFiProperties[M, OF, B, S, L] = {
    val __obj = js.Dynamic.literal()
    if (AllowGatewayARPPolling != null) __obj.updateDynamic("AllowGatewayARPPolling")(AllowGatewayARPPolling.asInstanceOf[js.Any])
    if (AutoConnect != null) __obj.updateDynamic("AutoConnect")(AutoConnect.asInstanceOf[js.Any])
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (EAP != null) __obj.updateDynamic("EAP")(EAP)
    if (!js.isUndefined(Frequency)) __obj.updateDynamic("Frequency")(Frequency)
    if (FrequencyList != null) __obj.updateDynamic("FrequencyList")(FrequencyList)
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID.asInstanceOf[js.Any])
    if (HiddenSSID != null) __obj.updateDynamic("HiddenSSID")(HiddenSSID.asInstanceOf[js.Any])
    if (Passphrase != null) __obj.updateDynamic("Passphrase")(Passphrase)
    if (RoamTreshold != null) __obj.updateDynamic("RoamTreshold")(RoamTreshold.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (Security != null) __obj.updateDynamic("Security")(Security.asInstanceOf[js.Any])
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    if (TetheringState != null) __obj.updateDynamic("TetheringState")(TetheringState)
    __obj.asInstanceOf[WiFiProperties[M, OF, B, S, L]]
  }
}

