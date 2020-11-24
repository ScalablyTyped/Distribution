package typings.chrome.global.chrome

import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = js.native
  
  var onStateChanged: IdleStateChangedEvent = js.native
  
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}
