package typings.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object with options for watchAcceleration */
trait AccelerometerOptions extends js.Object {
  /** How often to retrieve the Acceleration in milliseconds. (Default: 10000) */
  var frequency: js.UndefOr[Double] = js.undefined
}

object AccelerometerOptions {
  @scala.inline
  def apply(frequency: js.UndefOr[Double] = js.undefined): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOptions]
  }
}

