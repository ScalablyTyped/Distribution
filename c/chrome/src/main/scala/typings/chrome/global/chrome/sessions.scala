package typings.chrome.global.chrome

import typings.chrome.chrome.sessions.Device
import typings.chrome.chrome.sessions.Filter
import typings.chrome.chrome.sessions.Session
import typings.chrome.chrome.sessions.SessionChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Sessions
////////////////////
/**
  * Use the chrome.sessions API to query and restore tabs and windows from a browsing session.
  * Permissions:  "sessions"
  * @since Chrome 37.
  */
@JSGlobal("chrome.sessions")
@js.native
object sessions extends js.Object {
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

