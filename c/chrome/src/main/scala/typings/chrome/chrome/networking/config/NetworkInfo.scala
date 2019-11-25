package typings.chrome.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  /** Optional. The basic service set identification (BSSID) uniquely identifying the basic service set. BSSID is represented as a human readable, hex-encoded string with bytes separated by colons, e.g. 45:67:89:ab:cd:ef. */
  var BSSID: js.UndefOr[String] = js.undefined
  /** Optional. A unique identifier of the network. */
  var GUID: js.UndefOr[String] = js.undefined
  /** Optional. A hex-encoded byte sequence. */
  var HexSSID: js.UndefOr[String] = js.undefined
  /** Optional. The decoded SSID of the network (default encoding is UTF-8). To filter for non-UTF-8 SSIDs, use HexSSID instead. */
  var SSID: js.UndefOr[String] = js.undefined
  /** Optional. Identifier indicating the security type of the network. Valid values are None, WEP-PSK, WPA-PSK and WPA-EAP. */
  var Security: js.UndefOr[String] = js.undefined
  /** Currently only WiFi supported. */
  var Type: String
}

object NetworkInfo {
  @scala.inline
  def apply(
    Type: String,
    BSSID: String = null,
    GUID: String = null,
    HexSSID: String = null,
    SSID: String = null,
    Security: String = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (GUID != null) __obj.updateDynamic("GUID")(GUID.asInstanceOf[js.Any])
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (Security != null) __obj.updateDynamic("Security")(Security.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

