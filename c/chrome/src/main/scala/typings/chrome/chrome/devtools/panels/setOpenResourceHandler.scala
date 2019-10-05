package typings.chrome.chrome.devtools.panels

import typings.chrome.chrome.devtools.inspectedWindow.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.panels.setOpenResourceHandler")
@js.native
object setOpenResourceHandler extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
}

