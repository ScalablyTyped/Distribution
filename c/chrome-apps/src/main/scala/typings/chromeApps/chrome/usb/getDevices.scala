package typings.chromeApps.chrome.usb

import typings.chromeApps.AnonFiltersArray
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
  def apply(options: AnonFiltersArray, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
}

