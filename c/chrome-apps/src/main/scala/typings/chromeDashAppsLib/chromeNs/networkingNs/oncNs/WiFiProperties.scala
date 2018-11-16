package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WiFiProperties[M /* <: ManagedObject */, OF /* <: chromeDashAppsLib.chromeNs.networkingNs.oncNs.underscoreInternalUnderscoreNs.ObjectFunction */, B, S, L]
  extends WiFiPropertiesBase[M, java.lang.String | ManagedDOMString] {
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
  var FrequencyList: js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.integer]] = js.undefined
  /** Whether the network SSID will be broadcast. */
  var HiddenSSID: js.UndefOr[B] = js.undefined
  /**
               * @since Chrome 66.
               * The passphrase for WEP/WPA/WPA2 connections.
               * *This property can only be set!*
               */
  var Passphrase: js.UndefOr[java.lang.String] = js.undefined
  /** Signal-to-noise value (in dB) below which roaming to a new network should be attempted. */
  var RoamTreshold: js.UndefOr[L] = js.undefined
}

