package typings.chrome.chromeNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sessions")
@js.native
object ^ extends js.Object {
  var MAX_SESSION_RESULTS: Double = js.native
  var onChanged: SessionChangedEvent = js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  def restore(): Unit = js.native
  def restore(sessionId: String): Unit = js.native
  def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
}

