package typings.chrome.chrome.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sessions.getDevices")
@js.native
object getDevices extends js.Object {
  def apply(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  def apply(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
}

