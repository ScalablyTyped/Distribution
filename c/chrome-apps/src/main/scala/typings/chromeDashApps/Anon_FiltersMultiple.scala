package typings.chromeDashApps

import typings.chromeDashApps.chromeNs.usbNs.DeviceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersMultiple extends js.Object {
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object Anon_FiltersMultiple {
  @scala.inline
  def apply(filters: js.Array[DeviceFilter] = null, multiple: js.UndefOr[Boolean] = js.undefined): Anon_FiltersMultiple = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[Anon_FiltersMultiple]
  }
}

