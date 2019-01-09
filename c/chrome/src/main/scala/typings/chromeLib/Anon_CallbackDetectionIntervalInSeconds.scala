package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetectionIntervalInSeconds extends js.Object {
  var onStateChanged: chromeLib.chromeNs.idleNs.IdleStateChangedEvent
  def queryState(
    detectionIntervalInSeconds: scala.Double,
    callback: js.Function1[/* newState */ java.lang.String, scala.Unit]
  ): scala.Unit
  def setDetectionInterval(intervalInSeconds: scala.Double): scala.Unit
}

