package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.idle.IdleState
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.idle
//////////
// Idle //
//////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * @requires Permissions: 'idle'
  * @since Chrome 25.
  */
object idle {
  
  @JSGlobal("chrome.idle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when the system changes to an active, idle or locked state.
    * The event fires with 'locked' if the screen is locked or the screensaver activates,
    * 'idle' if the system is unlocked and the user has not generated any input for a
    * specified number of seconds, and 'active' when the user generates input on an idle system.
    */
  @JSGlobal("chrome.idle.onStateChanged")
  @js.native
  val onStateChanged: typings.chromeApps.chrome.events.Event[js.Function1[/* newState */ IdleState, Unit]] = js.native
  
  /**
    * Returns 'locked' if the system is locked, 'idle' if the user has not generated any input for a specified number of seconds, or 'active' otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    * Since Chrome 25.
    * @param callback The callback parameter should be a function that looks like this:
    * function( IdleState newState) {...};
    */
  @scala.inline
  def queryState(detectionIntervalInSeconds: integer, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("queryState")(detectionIntervalInSeconds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for
    * onStateChanged events.
    * The default interval is 60 seconds.
    * @since Chrome 25.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  @scala.inline
  def setDetectionInterval(intervalInSeconds: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDetectionInterval")(intervalInSeconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
