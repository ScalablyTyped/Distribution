package typings
package chromeLib.chromeNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sessions")
@js.native
object sessionsNsMembers extends js.Object {
  var MAX_SESSION_RESULTS: scala.Double = js.native
  var onChanged: SessionChangedEvent = js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], scala.Unit]): scala.Unit = js.native
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], scala.Unit]): scala.Unit = js.native
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], scala.Unit]): scala.Unit = js.native
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], scala.Unit]): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def restore(sessionId: java.lang.String): scala.Unit = js.native
  def restore(sessionId: java.lang.String, callback: js.Function1[/* restoredSession */ Session, scala.Unit]): scala.Unit = js.native
}

