package typings.cordovaPluginDeviceMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin provides access to the device's accelerometer. The accelerometer is a motion sensor
  * that detects the change (delta) in movement relative to the current device orientation,
  * in three dimensions along the x, y, and z axis.
  */
@js.native
trait Accelerometer extends StObject {
  
  /**
    * Stop watching the Acceleration referenced by the watchID parameter.
    * @param watchID The ID returned by navigator.accelerometer.watchAcceleration.
    */
  def clearWatch(watchID: WatchHandle): Unit = js.native
  
  /**
    * Get the current acceleration along the x, y, and z axes.
    * These acceleration values are returned to the accelerometerSuccess callback function.
    * @param accelerometerSuccess Success callback that gets the Acceleration object.
    * @param accelerometerError Success callback
    */
  def getCurrentAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit]
  ): Unit = js.native
  
  /**
    * Retrieves the device's current Acceleration at a regular interval, executing the
    * accelerometerSuccess callback function each time. Specify the interval in milliseconds
    * via the acceleratorOptions object's frequency parameter.
    * The returned watch ID references the accelerometer's watch interval, and can be used
    * with navigator.accelerometer.clearWatch to stop watching the accelerometer.
    * @param  accelerometerSuccess Callback, that called at every time interval and passes an Acceleration object.
    * @param  accelerometerError   Error callback.
    * @param  accelerometerOptions Object with options for watchAcceleration
    */
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit]
  ): WatchHandle = js.native
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit],
    accelerometerOptions: AccelerometerOptions
  ): WatchHandle = js.native
}
