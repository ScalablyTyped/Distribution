package typings
package chromeDashAppsLib.chromeNs.hidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserSelectedDevicePickerOptions extends js.Object {
  /**
               * Filter the list of devices presented to the user.
               * If multiple filters are provided devices matching any filter will be displayed.
               */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  /**
               * Allow the user to select multiple devices.
               */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
}

