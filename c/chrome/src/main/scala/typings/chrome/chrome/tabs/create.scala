package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.create")
@js.native
object create extends js.Object {
  def apply(createProperties: CreateProperties): Unit = js.native
  def apply(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
}

