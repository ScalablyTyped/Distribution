package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.discard")
@js.native
object discard extends js.Object {
  def apply(): Unit = js.native
  def apply(tabId: Double): Unit = js.native
  def apply(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
}

