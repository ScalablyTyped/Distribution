package typings.chromeApps

import typings.chromeApps.chrome.usb.DeviceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiltersArray extends js.Object {
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
}

object AnonFiltersArray {
  @scala.inline
  def apply(filters: js.Array[DeviceFilter] = null): AnonFiltersArray = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiltersArray]
  }
}

