package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.getInfo")
@js.native
object getInfo extends js.Object {
  /**
    * Requests the information for all attached display devices.
    * @param callback The callback to invoke with the results.
    */
  def apply(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
  /**
    * Requests the information for all attached display devices.
    * @since Chrome 59
    * @param flags Options affecting how the information is returned.
    * @param callback The callback to invoke with the results.
    */
  def apply(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
}

