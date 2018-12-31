package typings
package chromeDashAppsLib.chromeNs.networkingNs.configNs

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
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /** A unique identifier of the network. */
  var GUID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The decoded SSID of the network (default encoding is UTF-8).
    * To filter for non-UTF-8 SSIDs, use HexSSID instead.
    */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier indicating the security type of the network. */
  var Security: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.None | chromeDashAppsLib.chromeDashAppsLibStrings.`WEP-PSK` | chromeDashAppsLib.chromeDashAppsLibStrings.`WPA-PSK` | chromeDashAppsLib.chromeDashAppsLibStrings.`WPA-EAP`
  ] = js.undefined
  /** Currently only WiFi supported. */
  var Type: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_WIFI, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_WIFI[keyof chrome-apps.Anon_WIFI] */ js.Any
    ]
  ]
}

