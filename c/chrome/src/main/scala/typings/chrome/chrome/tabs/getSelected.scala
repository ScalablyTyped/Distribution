package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.getSelected")
@js.native
object getSelected extends js.Object {
  def apply(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def apply(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
}

