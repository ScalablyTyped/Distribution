package typings.chrome.chrome.tabs

import typings.chrome.chrome.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.highlight")
@js.native
object highlight extends js.Object {
  def apply(highlightInfo: HighlightInfo): Unit = js.native
  def apply(highlightInfo: HighlightInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
}

