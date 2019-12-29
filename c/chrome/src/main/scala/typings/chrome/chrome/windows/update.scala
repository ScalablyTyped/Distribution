package typings.chrome.chrome.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.update")
@js.native
object update extends js.Object {
  def apply(windowId: Double, updateInfo: UpdateInfo): Unit = js.native
  def apply(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
}

