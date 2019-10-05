package typings.chrome.chrome.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sessions.getRecentlyClosed")
@js.native
object getRecentlyClosed extends js.Object {
  def apply(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  def apply(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
}

