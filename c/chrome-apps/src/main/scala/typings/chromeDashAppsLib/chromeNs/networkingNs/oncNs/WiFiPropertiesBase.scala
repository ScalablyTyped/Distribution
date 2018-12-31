package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends js.Object {
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.undefined
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.undefined
  /** The network security type. */
  var Security: js.UndefOr[S] = js.undefined
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[java.lang.String] = js.undefined
}

