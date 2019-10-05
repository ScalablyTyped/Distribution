package typings.chromeDashApps.chrome.networking.config

import typings.chromeDashApps.Anon_WIFI
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.None
import typings.chromeDashApps.chromeDashAppsStrings.WiFi
import typings.chromeDashApps.chromeDashAppsStrings.`WEP-PSK`
import typings.chromeDashApps.chromeDashAppsStrings.`WPA-EAP`
import typings.chromeDashApps.chromeDashAppsStrings.`WPA-PSK`
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  /**
    * The basic service set identification (BSSID) uniquely identifying the
    * basic service set. *BSSID* is represented as a human readable,
    * hex-encoded string with bytes separated by colons, e.g.
    * 45:67:89:ab:cd:ef.
    */
  var BSSID: js.UndefOr[String] = js.undefined
  /** A unique identifier of the network. */
  var GUID: js.UndefOr[String] = js.undefined
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[String] = js.undefined
  /**
    * The decoded SSID of the network (default encoding is UTF-8).
    * To filter for non-UTF-8 SSIDs, use HexSSID instead.
    */
  var SSID: js.UndefOr[String] = js.undefined
  /** Identifier indicating the security type of the network. */
  var Security: js.UndefOr[None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`] = js.undefined
  /** Currently only WiFi supported. */
  var Type: ToStringLiteral[Anon_WIFI, String, Exclude[String, WiFi]]
}

object NetworkInfo {
  @scala.inline
  def apply(
    Type: ToStringLiteral[Anon_WIFI, String, Exclude[String, WiFi]],
    BSSID: String = null,
    GUID: String = null,
    HexSSID: String = null,
    SSID: String = null,
    Security: None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP` = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (GUID != null) __obj.updateDynamic("GUID")(GUID)
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID)
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    if (Security != null) __obj.updateDynamic("Security")(Security.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

