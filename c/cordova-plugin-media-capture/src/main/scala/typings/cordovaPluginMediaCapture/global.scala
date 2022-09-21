package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CaptureError")
  @js.native
  open class CaptureError protected ()
    extends StObject
       with typings.cordovaPluginMediaCapture.CaptureError {
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
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
  }
  object CaptureError {
    
    @JSGlobal("CaptureError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CaptureError.CAPTURE_APPLICATION_BUSY")
    @js.native
    def CAPTURE_APPLICATION_BUSY: Double = js.native
    inline def CAPTURE_APPLICATION_BUSY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_APPLICATION_BUSY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CaptureError.CAPTURE_INTERNAL_ERR")
    @js.native
    def CAPTURE_INTERNAL_ERR: Double = js.native
    inline def CAPTURE_INTERNAL_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_INTERNAL_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CaptureError.CAPTURE_INVALID_ARGUMENT")
    @js.native
    def CAPTURE_INVALID_ARGUMENT: Double = js.native
    inline def CAPTURE_INVALID_ARGUMENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CaptureError.CAPTURE_NOT_SUPPORTED")
    @js.native
    def CAPTURE_NOT_SUPPORTED: Double = js.native
    inline def CAPTURE_NOT_SUPPORTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CaptureError.CAPTURE_NO_MEDIA_FILES")
    @js.native
    def CAPTURE_NO_MEDIA_FILES: Double = js.native
    inline def CAPTURE_NO_MEDIA_FILES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_NO_MEDIA_FILES")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CaptureError.CAPTURE_PERMISSION_DENIED")
    @js.native
    def CAPTURE_PERMISSION_DENIED: Double = js.native
    inline def CAPTURE_PERMISSION_DENIED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPTURE_PERMISSION_DENIED")(x.asInstanceOf[js.Any])
  }
}
