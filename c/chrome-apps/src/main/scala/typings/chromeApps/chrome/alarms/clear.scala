package typings.chromeApps.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.clear")
@js.native
object clear extends js.Object {
  /**
    * Clears the alarm with the given name.
    * @param name The name of the alarm to clear. Defaults to the empty string.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def apply(): Unit = js.native
  /**
    * Clears the alarm without a name.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def apply(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def apply(name: String): Unit = js.native
  def apply(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
}

