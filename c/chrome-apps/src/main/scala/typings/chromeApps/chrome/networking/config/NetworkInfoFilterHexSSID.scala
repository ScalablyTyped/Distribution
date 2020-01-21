package typings.chromeApps.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfoFilterHexSSID extends js.Object {
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[String] = js.undefined
}

object NetworkInfoFilterHexSSID {
  @scala.inline
  def apply(HexSSID: String = null): NetworkInfoFilterHexSSID = {
    val __obj = js.Dynamic.literal()
    if (HexSSID != null) __obj.updateDynamic("HexSSID")(HexSSID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfoFilterHexSSID]
  }
}

