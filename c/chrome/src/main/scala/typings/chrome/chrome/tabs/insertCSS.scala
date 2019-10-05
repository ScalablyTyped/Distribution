package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.insertCSS")
@js.native
object insertCSS extends js.Object {
  def apply(details: InjectDetails): Unit = js.native
  def apply(details: InjectDetails, callback: js.Function): Unit = js.native
  def apply(tabId: Double, details: InjectDetails): Unit = js.native
  def apply(tabId: Double, details: InjectDetails, callback: js.Function): Unit = js.native
}

