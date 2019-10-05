package typings.cordovaDashPluginDashDeviceDashOrientation

import org.scalablytyped.runtime.Instantiable1
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

@JSGlobal("CompassError")
@js.native
object CompassError extends /** Constructor for CompassError object */
Instantiable1[/* code */ Double, CompassError] {
  var COMPASS_INTERNAL_ERR: Double = js.native
  var COMPASS_NOT_SUPPORTED: Double = js.native
}

