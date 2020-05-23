package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSelectionResult extends js.Object {
  /**
    * The filters in a device selection result.
    */
  var filters: js.UndefOr[DeviceFilters] = js.native
  /**
    * The number of devices that matched the device filter selection criteria.
    */
  var matchedDevicesCount: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of devices to be selected by a device filter and included in a test run.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
}

object DeviceSelectionResult {
  @scala.inline
  def apply(
    filters: DeviceFilters = null,
    matchedDevicesCount: js.UndefOr[Integer] = js.undefined,
    maxDevices: js.UndefOr[Integer] = js.undefined
  ): DeviceSelectionResult = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(matchedDevicesCount)) __obj.updateDynamic("matchedDevicesCount")(matchedDevicesCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDevices)) __obj.updateDynamic("maxDevices")(maxDevices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectionResult]
  }
}

