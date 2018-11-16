package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_FiltersArray extends js.Object {
  /**
                   * A list of USB device filters matching supported devices.
                   * A device only needs to match one of the provided filters.
                   * A vendorId is required and only one of productId or interfaceClass may be provided.
                   */
  var filters: js.Array[chromeDashAppsLib.chromeNs.usbNs.DeviceFilterStrict]
}

