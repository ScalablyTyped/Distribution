package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.requestAccess")
@js.native
object requestAccess extends js.Object {
  /**
    * @deprecated Since Chrome 40.
    * @requires(CrOS) Chrome OS specific. This operation is now implicitly performed as a part of *openDevice*.
    */
  def apply(device: Device, interfaceId: integer, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}

