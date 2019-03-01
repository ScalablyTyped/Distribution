package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDevicesPermission extends Permission {
  var usbDevices: js.Array[chromeDashAppsLib.Anon_ProductId]
}

object USBDevicesPermission {
  @scala.inline
  def apply(usbDevices: js.Array[chromeDashAppsLib.Anon_ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("usbDevices")(usbDevices)
    __obj.asInstanceOf[USBDevicesPermission]
  }
}

