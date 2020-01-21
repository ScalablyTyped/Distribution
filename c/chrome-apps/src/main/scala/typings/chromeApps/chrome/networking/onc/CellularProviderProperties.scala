package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularProviderProperties extends js.Object {
  /** Cellular network ID as a simple concatenation of the network's MCC (Mobile Country Code) and MNC (Mobile Network Code). */
  var Code: String
  /** The two-letter country code. */
  var Country: js.UndefOr[String] = js.undefined
  /** The operator name. */
  var Name: String
}

object CellularProviderProperties {
  @scala.inline
  def apply(Code: String, Name: String, Country: String = null): CellularProviderProperties = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularProviderProperties]
  }
}

