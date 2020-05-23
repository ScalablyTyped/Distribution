package typings.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CompassError object is returned to the onError callback function when an error occurs. */
trait CompassError extends js.Object {
  /**
    * One of the predefined error codes
    *     CompassError.COMPASS_INTERNAL_ERR
    *     CompassError.COMPASS_NOT_SUPPORTED
    */
  var code: Double
}

object CompassError {
  @scala.inline
  def apply(code: Double): CompassError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassError]
  }
}

