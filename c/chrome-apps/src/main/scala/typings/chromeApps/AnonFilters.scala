package typings.chromeApps

import typings.chromeApps.chrome.usb.DeviceFilterStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilters extends js.Object {
  /**
    * A list of USB device filters matching supported devices.
    * A device only needs to match one of the provided filters.
    * A vendorId is required and only one of productId or interfaceClass may be provided.
    */
  var filters: js.Array[DeviceFilterStrict]
}

object AnonFilters {
  @scala.inline
  def apply(filters: js.Array[DeviceFilterStrict]): AnonFilters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
}

