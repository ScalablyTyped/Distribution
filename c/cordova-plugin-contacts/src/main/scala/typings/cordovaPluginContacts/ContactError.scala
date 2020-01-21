package typings.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ContactError object is returned to the user through the contactError callback function when an error occurs. */
trait ContactError extends js.Object {
  /** Error code */
  var code: Double
  /** Error message */
  var message: String
}

@JSGlobal("ContactError")
@js.native
object ContactError extends Instantiable1[/* code */ Double, ContactError] {
  var INVALID_ARGUMENT_ERROR: Double = js.native
  var IO_ERROR: Double = js.native
  var NOT_SUPPORTED_ERROR: Double = js.native
  var PENDING_OPERATION_ERROR: Double = js.native
  var PERMISSION_DENIED_ERROR: Double = js.native
  var TIMEOUT_ERROR: Double = js.native
  var UNKNOWN_ERROR: Double = js.native
}

