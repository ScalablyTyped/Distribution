package typings.chrome.chrome.serial

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.send")
@js.native
object send extends js.Object {
  def apply(connectionId: Double, data: ArrayBuffer, callback: js.Function1[/* sendInfo */ js.Object, Unit]): Unit = js.native
}

