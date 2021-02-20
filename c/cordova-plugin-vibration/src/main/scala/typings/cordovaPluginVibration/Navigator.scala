package typings.cordovaPluginVibration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  /**
    * Vibrates the device with a given pattern.
    *
    * @param time - Sequence of durations (in milliseconds) for which to turn on or off the vibrator. Ignored on iOS.
    */
  def vibrate(time: js.Array[Double]): Unit = js.native
  /**
    * Vibrates the device for the specified amount of time.
    *
    * @param time - Milliseconds to vibrate the device. 0 cancels the vibration. Ignored on iOS.
    */
  def vibrate(time: Double): Unit = js.native
}
