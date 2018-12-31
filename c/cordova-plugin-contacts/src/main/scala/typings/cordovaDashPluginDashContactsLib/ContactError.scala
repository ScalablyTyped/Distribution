package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ContactError object is returned to the user through the contactError callback function when an error occurs. */
trait ContactError extends js.Object {
  /** Error code */
  var code: scala.Double
  /** Error message */
  var message: java.lang.String
}

@JSGlobal("ContactError")
@js.native
object ContactError
  extends org.scalablytyped.runtime.Instantiable1[/* code */ scala.Double, ContactError] {
  var INVALID_ARGUMENT_ERROR: scala.Double = js.native
  var IO_ERROR: scala.Double = js.native
  var NOT_SUPPORTED_ERROR: scala.Double = js.native
  var PENDING_OPERATION_ERROR: scala.Double = js.native
  var PERMISSION_DENIED_ERROR: scala.Double = js.native
  var TIMEOUT_ERROR: scala.Double = js.native
  var UNKNOWN_ERROR: scala.Double = js.native
}

