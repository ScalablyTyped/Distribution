package typings.chrome.chrome.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.get")
@js.native
object get extends js.Object {
  def apply(windowId: Double, callback: js.Function1[/* window */ typings.chrome.chrome.windows.Window, Unit]): Unit = js.native
  def apply(
    windowId: Double,
    getInfo: GetInfo,
    callback: js.Function1[/* window */ typings.chrome.chrome.windows.Window, Unit]
  ): Unit = js.native
}

