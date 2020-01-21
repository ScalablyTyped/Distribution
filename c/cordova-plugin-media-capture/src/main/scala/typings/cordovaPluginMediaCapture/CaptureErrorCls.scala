package typings.cordovaPluginMediaCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CaptureError")
@js.native
class CaptureErrorCls protected () extends CaptureError {
  /** Constructor for CaptureError  */
  def this(code: Double, message: String) = this()
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
  /* CompleteClass */
  override var code: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
}

