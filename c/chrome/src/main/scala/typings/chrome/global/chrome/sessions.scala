package typings.chrome.global.chrome

import typings.chrome.chrome.sessions.Device
import typings.chrome.chrome.sessions.Filter
import typings.chrome.chrome.sessions.Session
import typings.chrome.chrome.sessions.SessionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.sessions.getDevices")
  @js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  @JSGlobal("chrome.sessions.getDevices")
  @js.native
  def getDevices(filter: Filter, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  
  @JSGlobal("chrome.sessions.getRecentlyClosed")
  @js.native
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  @JSGlobal("chrome.sessions.getRecentlyClosed")
  @js.native
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): Unit = js.native
  
  @JSGlobal("chrome.sessions.onChanged")
  @js.native
  def onChanged: SessionChangedEvent = js.native
  @scala.inline
  def onChanged_=(x: SessionChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.sessions.restore")
  @js.native
  def restore(): Unit = js.native
  @JSGlobal("chrome.sessions.restore")
  @js.native
  def restore(sessionId: js.UndefOr[scala.Nothing], callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
  @JSGlobal("chrome.sessions.restore")
  @js.native
  def restore(sessionId: String): Unit = js.native
  @JSGlobal("chrome.sessions.restore")
  @js.native
  def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): Unit = js.native
}
