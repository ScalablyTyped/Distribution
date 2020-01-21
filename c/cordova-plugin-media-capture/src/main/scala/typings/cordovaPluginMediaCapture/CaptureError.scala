package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the error code resulting from a failed media capture operation. */
trait CaptureError extends js.Object {
  /**
    * One of the pre-defined error codes listed below.
    *     CaptureError.CAPTURE_INTERNAL_ERR
    *         The camera or microphone failed to capture image or sound.
    *     CaptureError.CAPTURE_APPLICATION_BUSY
    *         The camera or audio capture application is currently serving another capture request.
    *     CaptureError.CAPTURE_INVALID_ARGUMENT
    *         Invalid use of the API (e.g., the value of limit is less than one).
    *     CaptureError.CAPTURE_NO_MEDIA_FILES
    *         The user exits the camera or audio capture application before capturing anything.
    *     CaptureError.CAPTURE_NOT_SUPPORTED
    *         The requested capture operation is not supported.
    */
  var code: Double
  var message: String
}

@JSGlobal("CaptureError")
@js.native
object CaptureError extends /** Constructor for CaptureError  */
Instantiable2[/* code */ Double, /* message */ String, CaptureError] {
  var CAPTURE_APPLICATION_BUSY: Double = js.native
  var CAPTURE_INTERNAL_ERR: Double = js.native
  var CAPTURE_INVALID_ARGUMENT: Double = js.native
  var CAPTURE_NOT_SUPPORTED: Double = js.native
  var CAPTURE_NO_MEDIA_FILES: Double = js.native
  var CAPTURE_PERMISSION_DENIED: Double = js.native
}

