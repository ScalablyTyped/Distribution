package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.idle.IdleState
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofidle extends StObject {
  
  /**
    * Fired when the system changes to an active, idle or locked state.
    * The event fires with 'locked' if the screen is locked or the screensaver activates,
    * 'idle' if the system is unlocked and the user has not generated any input for a
    * specified number of seconds, and 'active' when the user generates input on an idle system.
    */
  val onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]]
  
  /**
    * Returns 'locked' if the system is locked, 'idle' if the user has not generated any input for a specified number of seconds, or 'active' otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since the last user input detected.
    * Since Chrome 25.
    * @param callback The callback parameter should be a function that looks like this:
    * function( IdleState newState) {...};
    */
  def queryState(detectionIntervalInSeconds: integer, callback: js.Function1[/* newState */ IdleState, Unit]): Unit
  
  /**
    * Sets the interval, in seconds, used to determine when the system is in an idle state for
    * onStateChanged events.
    * The default interval is 60 seconds.
    * @since Chrome 25.
    * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
    */
  def setDetectionInterval(intervalInSeconds: integer): Unit
}
object Typeofidle {
  
  inline def apply(
    onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]],
    queryState: (integer, js.Function1[/* newState */ IdleState, Unit]) => Unit,
    setDetectionInterval: integer => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
  
  extension [Self <: Typeofidle](x: Self) {
    
    inline def setOnStateChanged(value: Event[js.Function1[/* newState */ IdleState, Unit]]): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
    
    inline def setQueryState(value: (integer, js.Function1[/* newState */ IdleState, Unit]) => Unit): Self = StObject.set(x, "queryState", js.Any.fromFunction2(value))
    
    inline def setSetDetectionInterval(value: integer => Unit): Self = StObject.set(x, "setDetectionInterval", js.Any.fromFunction1(value))
  }
}
