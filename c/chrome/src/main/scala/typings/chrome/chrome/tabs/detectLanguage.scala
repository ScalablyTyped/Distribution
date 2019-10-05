package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.detectLanguage")
@js.native
object detectLanguage extends js.Object {
  def apply(callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  def apply(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = js.native
}

