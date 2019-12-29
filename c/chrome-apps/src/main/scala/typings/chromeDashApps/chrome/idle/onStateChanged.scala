package typings.chromeDashApps.chrome.idle

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the system changes to an active, idle or locked state.
  * The event fires with 'locked' if the screen is locked or the screensaver activates,
  * 'idle' if the system is unlocked and the user has not generated any input for a
  * specified number of seconds, and 'active' when the user generates input on an idle system.
  */
@JSGlobal("chrome.idle.onStateChanged")
@js.native
object onStateChanged
  extends TopLevel[Event[js.Function1[/* newState */ IdleState, Unit]]]

