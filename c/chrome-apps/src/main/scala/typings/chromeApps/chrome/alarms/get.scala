package typings.chromeApps.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.get")
@js.native
object get extends js.Object {
  /**
    * Retrieves details about the specified alarm.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  def apply(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  /**
    * Retrieves details about the specified alarm.
    * @param name The name of the alarm to get. Defaults to the empty string.
    * @param callback The callback parameter should be a function that looks like this:
    * @example function( Alarm alarm) {...};
    */
  def apply(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
}

