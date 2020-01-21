package typings.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome._debugger.sendCommand")
@js.native
object sendCommand extends js.Object {
  def apply(target: Debuggee, method: String): Unit = js.native
  def apply(target: Debuggee, method: String, commandParams: js.Object): Unit = js.native
  def apply(
    target: Debuggee,
    method: String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
}

