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

object Anon_CallbackDetectionIntervalInSeconds {
  @scala.inline
  def apply(
    onStateChanged: chromeLib.chromeNs.idleNs.IdleStateChangedEvent,
    queryState: js.Function2[scala.Double, js.Function1[/* newState */ java.lang.String, scala.Unit], scala.Unit],
    setDetectionInterval: js.Function1[scala.Double, scala.Unit]
  ): Anon_CallbackDetectionIntervalInSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onStateChanged")(onStateChanged)
    __obj.updateDynamic("queryState")(queryState)
    __obj.updateDynamic("setDetectionInterval")(setDetectionInterval)
    __obj.asInstanceOf[Anon_CallbackDetectionIntervalInSeconds]
  }
}

