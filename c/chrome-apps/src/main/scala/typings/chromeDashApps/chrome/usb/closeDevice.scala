package typings.chromeDashApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.closeDevice")
@js.native
object closeDevice extends js.Object {
  /**
    * Closes a connection handle.
    * Invoking operations on a handle after it has been closed is a safe operation but causes no action to be taken.
    * @param handle The ConnectionHandle to close.
    * @param [callback]
    */
  def apply(handle: ConnectionHandle): Unit = js.native
  def apply(handle: ConnectionHandle, callback: js.Function0[Unit]): Unit = js.native
}

