package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.Anon_ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDevicesPermission extends Permission {
  var usbDevices: js.Array[Anon_ProductId]
}

object USBDevicesPermission {
  @scala.inline
  def apply(usbDevices: js.Array[Anon_ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices)
  
    __obj.asInstanceOf[USBDevicesPermission]
  }
}

