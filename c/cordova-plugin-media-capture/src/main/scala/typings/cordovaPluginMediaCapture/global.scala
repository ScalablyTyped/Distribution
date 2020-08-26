package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class CaptureError protected ()
    extends typings.cordovaPluginMediaCapture.CaptureError {
    /** Constructor for CaptureError  */
    def this(code: Double, message: String) = this()
  }
  
  @js.native
  object CaptureError
    extends /** Constructor for CaptureError  */
  Instantiable2[
          /* code */ Double, 
          /* message */ String, 
          typings.cordovaPluginMediaCapture.CaptureError
        ] {
    var CAPTURE_APPLICATION_BUSY: Double = js.native
    var CAPTURE_INTERNAL_ERR: Double = js.native
    var CAPTURE_INVALID_ARGUMENT: Double = js.native
    var CAPTURE_NOT_SUPPORTED: Double = js.native
    var CAPTURE_NO_MEDIA_FILES: Double = js.native
    var CAPTURE_PERMISSION_DENIED: Double = js.native
  }
  
}

