package typings.chrome.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.getInfo")
@js.native
object getInfo extends js.Object {
  def apply(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
  def apply(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
}

