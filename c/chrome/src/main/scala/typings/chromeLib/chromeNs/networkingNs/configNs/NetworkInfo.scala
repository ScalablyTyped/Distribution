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

