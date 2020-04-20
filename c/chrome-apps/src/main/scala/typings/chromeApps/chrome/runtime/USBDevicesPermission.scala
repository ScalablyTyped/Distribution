package typings.chromeApps.chrome.runtime

import typings.chromeApps.AnonProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDevicesPermission extends Permission {
  var usbDevices: js.Array[AnonProductId]
}

object USBDevicesPermission {
  @scala.inline
  def apply(usbDevices: js.Array[AnonProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
}

