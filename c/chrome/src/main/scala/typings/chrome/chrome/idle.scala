package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
@JSGlobal("chrome.idle")
@js.native
object idle extends js.Object {
  var onStateChanged: IdleStateChangedEvent = js.native
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ String, Unit]): Unit = js.native
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ String, Unit]]
}

