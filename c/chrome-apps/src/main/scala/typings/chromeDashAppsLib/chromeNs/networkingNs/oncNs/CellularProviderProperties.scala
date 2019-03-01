package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularProviderProperties extends js.Object {
  /** Cellular network ID as a simple concatenation of the network's MCC (Mobile Country Code) and MNC (Mobile Network Code). */
  var Code: java.lang.String
  /** The two-letter country code. */
  var Country: js.UndefOr[java.lang.String] = js.undefined
  /** The operator name. */
  var Name: java.lang.String
}

object CellularProviderProperties {
  @scala.inline
  def apply(Code: java.lang.String, Name: java.lang.String, Country: java.lang.String = null): CellularProviderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Code")(Code)
    __obj.updateDynamic("Name")(Name)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    __obj.asInstanceOf[CellularProviderProperties]
  }
}

