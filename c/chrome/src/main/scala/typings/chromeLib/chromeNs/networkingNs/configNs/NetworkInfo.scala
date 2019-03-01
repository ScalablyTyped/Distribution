package typings
package chromeLib.chromeNs.networkingNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  /** Optional. The basic service set identification (BSSID) uniquely identifying the basic service set. BSSID is represented as a human readable, hex-encoded string with bytes separated by colons, e.g. 45:67:89:ab:cd:ef. */
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. A unique identifier of the network. */
  var GUID: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. A hex-encoded byte sequence. */
  var HexSSID: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The decoded SSID of the network (default encoding is UTF-8). To filter for non-UTF-8 SSIDs, use HexSSID instead. */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Identifier indicating the security type of the network. Valid values are None, WEP-PSK, WPA-PSK and WPA-EAP. */
  var Security: js.UndefOr[java.lang.String] = js.undefined
  /** Currently only WiFi supported. */
  var Type: java.lang.String
}

object NetworkInfo {
  @scala.inline
  def apply(
    Type: java.lang.String,
    BSSID: java.lang.String = null,
    GUID: java.lang.String = null,
    HexSSID: java.lang.String = null,
    SSID: java.lang.String = null,
    Security: java.lang.String = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Type")(Type)
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID)
    if (GUID != null) __obj.updateDynamic("GUID")(GUID)
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID)
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    if (Security != null) __obj.updateDynamic("Security")(Security)
    __obj.asInstanceOf[NetworkInfo]
  }
}

