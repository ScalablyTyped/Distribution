package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.move")
@js.native
object move extends js.Object {
  def apply(tabId: Double, moveProperties: MoveProperties): Unit = js.native
  def apply(tabId: Double, moveProperties: MoveProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def apply(tabIds: js.Array[Double], moveProperties: MoveProperties): Unit = js.native
  def apply(
    tabIds: js.Array[Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], Unit]
  ): Unit = js.native
}

