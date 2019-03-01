package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetectionIntervalInSeconds extends js.Object {
  /**
    * Fired when the system changes to an active, idle or locked state.
    * The event fires with 'locked' if the screen is locked or the screensaver activates,
    * 'idle' if the system is unlocked and the user has not generated any input for a
    * specified number of seconds, and 'active' when the user generates input on an idle system.
    */
  val onStateChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* newState */ chromeDashAppsLib.chromeNs.idleNs.IdleState, scala.Unit]
  ]
  /**
    * Returns 'locked' if the system is locked, 'idle' if the user has not generated any input for a specified number of seconds, or 'active' otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    * Since Chrome 25.
    * @param callback The callback parameter should be a function that looks like this:
    * function( IdleState newState) {...};
    */
  def queryState(
    detectionIntervalInSeconds: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* newState */ chromeDashAppsLib.chromeNs.idleNs.IdleState, scala.Unit]
  ): scala.Unit
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for
    * onStateChanged events.
    * The default interval is 60 seconds.
    * @since Chrome 25.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: chromeDashAppsLib.chromeNs.integer): scala.Unit
}

object Anon_CallbackDetectionIntervalInSeconds {
  @scala.inline
  def apply(
    onStateChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function1[/* newState */ chromeDashAppsLib.chromeNs.idleNs.IdleState, scala.Unit]
    ],
    queryState: js.Function2[
      chromeDashAppsLib.chromeNs.integer, 
      js.Function1[/* newState */ chromeDashAppsLib.chromeNs.idleNs.IdleState, scala.Unit], 
      scala.Unit
    ],
    setDetectionInterval: js.Function1[chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): Anon_CallbackDetectionIntervalInSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onStateChanged")(onStateChanged)
    __obj.updateDynamic("queryState")(queryState)
    __obj.updateDynamic("setDetectionInterval")(setDetectionInterval)
    __obj.asInstanceOf[Anon_CallbackDetectionIntervalInSeconds]
  }
}

