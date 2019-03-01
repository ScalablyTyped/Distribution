package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersArray extends js.Object {
  var filters: js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.usbNs.DeviceFilter]] = js.undefined
}

object Anon_FiltersArray {
  @scala.inline
  def apply(filters: js.Array[chromeDashAppsLib.chromeNs.usbNs.DeviceFilter] = null): Anon_FiltersArray = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_FiltersArray]
  }
}

