package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.Anon_FiltersArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.getDevices")
@js.native
object getDevices extends js.Object {
  /**
    * @description Enumerates connected USB devices.
    * @since Chrome 39.
    * @param options The properties to search for on target devices.
    * @param callback
    */
  def apply(options: Anon_FiltersArray, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
}

