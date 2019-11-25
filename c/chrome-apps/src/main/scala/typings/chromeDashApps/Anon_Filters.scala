package typings.chromeDashApps

import typings.chromeDashApps.chrome.usb.DeviceFilterStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  /**
    * A list of USB device filters matching supported devices.
    * A device only needs to match one of the provided filters.
    * A vendorId is required and only one of productId or interfaceClass may be provided.
    */
  var filters: js.Array[DeviceFilterStrict]
}

object Anon_Filters {
  @scala.inline
  def apply(filters: js.Array[DeviceFilterStrict]): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filters]
  }
}

