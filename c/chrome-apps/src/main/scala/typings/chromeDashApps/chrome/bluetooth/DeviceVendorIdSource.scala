package typings.chromeDashApps.chrome.bluetooth

import typings.chromeDashApps.chromeDashAppsStrings.bluetooth_
import typings.chromeDashApps.chromeDashAppsStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.bluetooth_
  - typings.chromeDashApps.chromeDashAppsStrings.usb_
*/
trait DeviceVendorIdSource extends js.Object

object DeviceVendorIdSource {
  @scala.inline
  def bluetooth: bluetooth_ = this.cast("bluetooth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def usb: usb_ = this.cast("usb")
}

