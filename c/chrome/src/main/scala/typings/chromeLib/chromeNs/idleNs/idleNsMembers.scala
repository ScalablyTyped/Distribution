package typings
package chromeLib.chromeNs.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.idle")
@js.native
object idleNsMembers extends js.Object {
  var onStateChanged: IdleStateChangedEvent = js.native
  def queryState(
    detectionIntervalInSeconds: scala.Double,
    callback: js.Function1[/* newState */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setDetectionInterval(intervalInSeconds: scala.Double): scala.Unit = js.native
}

