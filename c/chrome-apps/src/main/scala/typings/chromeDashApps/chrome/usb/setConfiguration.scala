package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.setConfiguration")
@js.native
object setConfiguration extends js.Object {
  /**
    * Select a device configuration.
    * This function effectively resets the device by selecting one of the
    * device's available configurations. Only configuration values greater
    * than 0 are valid however some buggy devices have a working
    * configuration 0 and so this value is allowed.
    * @since Chrome 42.
    * @param handle An open connection to the device.
    * @param configurationValue
    * @param callback
    */
  def apply(handle: ConnectionHandle, configurationValue: integer, callback: js.Function0[Unit]): Unit = js.native
}

