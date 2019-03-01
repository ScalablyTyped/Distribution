package typings
package chromeDashAppsLib.chromeNs.networkingNs.configNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfoFilterHexSSID extends js.Object {
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkInfoFilterHexSSID {
  @scala.inline
  def apply(HexSSID: java.lang.String = null): NetworkInfoFilterHexSSID = {
    val __obj = js.Dynamic.literal()
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID)
    __obj.asInstanceOf[NetworkInfoFilterHexSSID]
  }
}

