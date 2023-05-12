package typings.chrome.global.chrome

import typings.chrome.chrome.sessions.Device
import typings.chrome.chrome.sessions.Filter
import typings.chrome.chrome.sessions.Session
import typings.chrome.chrome.sessions.SessionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Sessions
////////////////////
/**
  * Use the chrome.sessions API to query and restore tabs and windows from a browsing session.
  * Permissions:  "sessions"
  * @since Chrome 37.
  */
object sessions {
  
  @JSGlobal("chrome.sessions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.sessions.MAX_SESSION_RESULTS")
  @js.native
  def MAX_SESSION_RESULTS: Double = js.native
  inline def MAX_SESSION_RESULTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SESSION_RESULTS")(x.asInstanceOf[js.Any])
  
  inline def getDevices(): js.Promise[js.Array[Device]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[Device]]]
  inline def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getDevices(filter: Filter): js.Promise[js.Array[Device]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Device]]]
  inline def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRecentlyClosed(): js.Promise[js.Array[Session]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")().asInstanceOf[js.Promise[js.Array[Session]]]
  inline def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getRecentlyClosed(filter: Filter): js.Promise[js.Array[Session]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Session]]]
  inline def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.sessions.onChanged")
  @js.native
  def onChanged: SessionChangedEvent = js.native
  inline def onChanged_=(x: SessionChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  inline def restore(): js.Promise[Session] = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[js.Promise[Session]]
  inline def restore(callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restore(sessionId: String): js.Promise[Session] = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session]]
  inline def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
