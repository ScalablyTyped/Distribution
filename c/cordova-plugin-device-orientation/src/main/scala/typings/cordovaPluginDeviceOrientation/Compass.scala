package typings.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * This plugin provides access to the device's compass. The compass is a sensor that detects
  * the direction or heading that the device is pointed, typically from the top of the device.
  * It measures the heading in degrees from 0 to 359.99, where 0 is north.
  */
@js.native
trait Compass extends js.Object {
  /**
    * Stop watching the compass referenced by the watch ID parameter.
    * @param id The ID returned by navigator.compass.watchHeading.
    */
  def clearWatch(id: Double): Unit = js.native
  /**
    * Get the current compass heading. The compass heading is returned via a CompassHeading
    * object using the onSuccess callback function.
    * @param onSuccess Success callback that passes CompassHeading object.
    * @param onError Error callback that passes CompassError object.
    */
  def getCurrentHeading(
    onSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    onError: js.Function1[/* error */ CompassError, Unit]
  ): Unit = js.native
  def getCurrentHeading(
    onSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    onError: js.Function1[/* error */ CompassError, Unit],
    options: CompassOptions
  ): Unit = js.native
  /**
    * Gets the device's current heading at a regular interval. Each time the heading is retrieved,
    * the headingSuccess callback function is executed. The returned watch ID references the compass
    * watch interval. The watch ID can be used with navigator.compass.clearWatch to stop watching
    * the navigator.compass.
    * @param onSuccess Success callback that passes CompassHeading object.
    * @param onError   Error callback that passes CompassError object.
    * @param options   CompassOptions object
    */
  def watchHeading(
    onSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    onError: js.Function1[/* error */ CompassError, Unit]
  ): Double = js.native
  def watchHeading(
    onSuccess: js.Function1[/* heading */ CompassHeading, Unit],
    onError: js.Function1[/* error */ CompassError, Unit],
    options: CompassOptions
  ): Double = js.native
}

