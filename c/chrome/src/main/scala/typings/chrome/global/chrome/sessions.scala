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
  @scala.inline
  def MAX_SESSION_RESULTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SESSION_RESULTS")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.sessions.onChanged")
  @js.native
  def onChanged: SessionChangedEvent = js.native
  @scala.inline
  def onChanged_=(x: SessionChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  @scala.inline
  def restore(sessionId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def restore(sessionId: Unit, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
