package typings
package cordovaDashPluginDashVibrationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /**
    * Immediately cancels any currently running vibration.
    * @deprecated
    */
  def cancelVibration(): scala.Unit
  /**
  	 * Vibrates the device for the specified amount of time.
  	 * @param time Milliseconds to vibrate the device. Ignored on iOS.
    * @deprecated
  	 */
  def vibrate(time: scala.Double): scala.Unit
  /**
    * Vibrates the device with a given pattern.
    * @param number[] pattern Pattern with which to vibrate the device.
    *                         The first value - number of milliseconds to wait before turning the vibrator on.
    *                         The next value - the number of milliseconds for which to keep the vibrator on before turning it off.
    * @param number  repeat   Optional index into the pattern array at which to start repeating (will repeat until canceled),
    *                         or -1 for no repetition (default).
    * @deprecated
    */
  def vibrateWithPattern(pattern: js.Array[scala.Double], repeat: scala.Double): scala.Unit
}

object Notification {
  @scala.inline
  def apply(
    cancelVibration: js.Function0[scala.Unit],
    vibrate: js.Function1[scala.Double, scala.Unit],
    vibrateWithPattern: js.Function2[js.Array[scala.Double], scala.Double, scala.Unit]
  ): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelVibration")(cancelVibration)
    __obj.updateDynamic("vibrate")(vibrate)
    __obj.updateDynamic("vibrateWithPattern")(vibrateWithPattern)
    __obj.asInstanceOf[Notification]
  }
}

