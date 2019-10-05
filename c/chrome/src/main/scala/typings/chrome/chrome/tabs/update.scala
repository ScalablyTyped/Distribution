package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.update")
@js.native
object update extends js.Object {
  def apply(tabId: Double, updateProperties: UpdateProperties): Unit = js.native
  def apply(
    tabId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]
  ): Unit = js.native
  def apply(updateProperties: UpdateProperties): Unit = js.native
  def apply(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
}

