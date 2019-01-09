package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackDevices extends js.Object {
  var MAX_SESSION_RESULTS: scala.Double = js.native
  var onChanged: chromeLib.chromeNs.sessionsNs.SessionChangedEvent = js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[chromeLib.chromeNs.sessionsNs.Device], scala.Unit]): scala.Unit = js.native
  def getDevices(
    filter: chromeLib.chromeNs.sessionsNs.Filter,
    callback: js.Function1[/* devices */ js.Array[chromeLib.chromeNs.sessionsNs.Device], scala.Unit]
  ): scala.Unit = js.native
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[chromeLib.chromeNs.sessionsNs.Session], scala.Unit]): scala.Unit = js.native
  def getRecentlyClosed(
    filter: chromeLib.chromeNs.sessionsNs.Filter,
    callback: js.Function1[/* sessions */ js.Array[chromeLib.chromeNs.sessionsNs.Session], scala.Unit]
  ): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def restore(sessionId: java.lang.String): scala.Unit = js.native
  def restore(
    sessionId: java.lang.String,
    callback: js.Function1[/* restoredSession */ chromeLib.chromeNs.sessionsNs.Session, scala.Unit]
  ): scala.Unit = js.native
}

