package typings
package cordovaDashPluginDashDeviceDashOrientationLib

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
  var code: scala.Double
}

@JSGlobal("CompassError")
@js.native
object CompassError
  extends /** Constructor for CompassError object */
org.scalablytyped.runtime.Instantiable1[/* code */ scala.Double, CompassError] {
  var COMPASS_INTERNAL_ERR: scala.Double = js.native
  var COMPASS_NOT_SUPPORTED: scala.Double = js.native
}

