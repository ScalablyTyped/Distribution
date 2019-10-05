package typings.chromeDashApps.chrome.bluetooth

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
  */
trait DeviceFilter extends js.Object {
  /** Type of filter to apply to the device list. Default is all. */
  var filterType: js.UndefOr[DeviceFilterType] = js.undefined
  /** Maximum number of bluetoth devices to return. Default is 0 (no limit) if unspecified. */
  var limit: js.UndefOr[integer] = js.undefined
}

object DeviceFilter {
  @scala.inline
  def apply(filterType: DeviceFilterType = null, limit: Int | Double = null): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilter]
  }
}

