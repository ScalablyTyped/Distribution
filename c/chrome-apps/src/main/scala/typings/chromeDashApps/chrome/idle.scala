package typings.chromeDashApps.chrome

import typings.chromeDashApps.chrome.idle.IdleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("chrome.idle")
@js.native
object idle extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.chromeDashApps.chromeDashAppsStrings.active
    - typings.chromeDashApps.chromeDashAppsStrings.idle
    - typings.chromeDashApps.chromeDashAppsStrings.locked
  */
  trait IdleState extends js.Object
  
  /**
    * Fired when the system changes to an active, idle or locked state.
    * The event fires with 'locked' if the screen is locked or the screensaver activates,
    * 'idle' if the system is unlocked and the user has not generated any input for a
    * specified number of seconds, and 'active' when the user generates input on an idle system.
    */
  val onStateChanged: typings.chromeDashApps.chrome.events.Event[js.Function1[/* newState */ IdleState, Unit]] = js.native
  /**
    * Returns 'locked' if the system is locked, 'idle' if the user has not generated any input for a specified number of seconds, or 'active' otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    * Since Chrome 25.
    * @param callback The callback parameter should be a function that looks like this:
    * function( IdleState newState) {...};
    */
  def queryState(detectionIntervalInSeconds: integer, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for
    * onStateChanged events.
    * The default interval is 60 seconds.
    * @since Chrome 25.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: integer): Unit = js.native
}

