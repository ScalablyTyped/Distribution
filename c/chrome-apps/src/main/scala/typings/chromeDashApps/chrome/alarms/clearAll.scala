package typings.chromeDashApps.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.clearAll")
@js.native
object clearAll extends js.Object {
  /**
    * Clears all alarms.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * @example function(boolean wasCleared) {...};
    */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
}

