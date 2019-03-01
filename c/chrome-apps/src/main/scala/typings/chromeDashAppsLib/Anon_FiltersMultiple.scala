package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersMultiple extends js.Object {
  var filters: js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.usbNs.DeviceFilter]] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FiltersMultiple {
  @scala.inline
  def apply(
    filters: js.Array[chromeDashAppsLib.chromeNs.usbNs.DeviceFilter] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FiltersMultiple = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[Anon_FiltersMultiple]
  }
}

