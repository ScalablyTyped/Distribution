package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getBackgroundPage")
@js.native
object getBackgroundPage extends js.Object {
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  def apply(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = js.native
}

