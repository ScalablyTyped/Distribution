package typings.chrome.global.chrome

import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.idle.IdleStateChangedEvent
import org.scalablytyped.runtime.StObject
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
object idle {
  
  @JSGlobal("chrome.idle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.idle.getAutoLockDelay")
  @js.native
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = js.native
  
  @JSGlobal("chrome.idle.onStateChanged")
  @js.native
  def onStateChanged: IdleStateChangedEvent = js.native
  @scala.inline
  def onStateChanged_=(x: IdleStateChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.idle.queryState")
  @js.native
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  
  @JSGlobal("chrome.idle.setDetectionInterval")
  @js.native
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}
