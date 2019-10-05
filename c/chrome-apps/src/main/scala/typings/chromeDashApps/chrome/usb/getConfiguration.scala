package typings.chromeDashApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.getConfiguration")
@js.native
object getConfiguration extends js.Object {
  /**
    * Gets the configuration descriptor for the currently selected configuration.
    * @since Chrome 39.
    * @param handle An open connection to the device.
    * @param callback
    */
  def apply(handle: ConnectionHandle, callback: js.Function1[/* config */ ConfigDescriptor, Unit]): Unit = js.native
}

