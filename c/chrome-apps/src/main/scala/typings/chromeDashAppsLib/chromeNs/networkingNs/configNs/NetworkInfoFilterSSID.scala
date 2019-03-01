package typings
package chromeDashAppsLib.chromeNs.networkingNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfoFilterSSID extends js.Object {
  /**
    * The decoded SSID of the network (default encoding is UTF-8).
    * To filter for non-UTF-8 SSIDs, use HexSSID instead.
    */
  var SSID: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkInfoFilterSSID {
  @scala.inline
  def apply(SSID: java.lang.String = null): NetworkInfoFilterSSID = {
    val __obj = js.Dynamic.literal()
    if (SSID != null) __obj.updateDynamic("SSID")(SSID)
    __obj.asInstanceOf[NetworkInfoFilterSSID]
  }
}

