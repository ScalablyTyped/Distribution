package typings.chromeApps.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.getAll")
@js.native
object getAll extends js.Object {
  /**
    * Gets an array of all the alarms.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function(array of Alarm alarms) {...};
    */
  def apply(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
}

