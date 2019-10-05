package typings.chrome.chrome.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sessions.restore")
@js.native
object restore extends js.Object {
  def apply(): Unit = js.native
  def apply(sessionId: String): Unit = js.native
  def apply(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
}

