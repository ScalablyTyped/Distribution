package typings.cordovaPluginCanvascamera

import typings.cordovaPluginCanvascamera.anon.Height
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasCameraOptions extends StObject {
  
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[front | back] = js.undefined
  
  var canvas: js.UndefOr[Height] = js.undefined
  
  var capture: js.UndefOr[Height] = js.undefined
  
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[Double] = js.undefined
  
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[file | data] = js.undefined
  
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CanvasCameraOptions {
  
  inline def apply(): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasCameraOptions]
  }
  
  extension [Self <: CanvasCameraOptions](x: Self) {
    
    inline def setCameraFacing(value: front | back): Self = StObject.set(x, "cameraFacing", value.asInstanceOf[js.Any])
    
    inline def setCameraFacingUndefined: Self = StObject.set(x, "cameraFacing", js.undefined)
    
    inline def setCanvas(value: Height): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setCapture(value: Height): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setFlashMode(value: Boolean): Self = StObject.set(x, "flashMode", value.asInstanceOf[js.Any])
    
    inline def setFlashModeUndefined: Self = StObject.set(x, "flashMode", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnAfterDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = StObject.set(x, "onAfterDraw", js.Any.fromFunction1(value))
    
    inline def setOnAfterDrawUndefined: Self = StObject.set(x, "onAfterDraw", js.undefined)
    
    inline def setOnBeforeDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = StObject.set(x, "onBeforeDraw", js.Any.fromFunction1(value))
    
    inline def setOnBeforeDrawUndefined: Self = StObject.set(x, "onBeforeDraw", js.undefined)
    
    inline def setThumbnailRatio(value: Double): Self = StObject.set(x, "thumbnailRatio", value.asInstanceOf[js.Any])
    
    inline def setThumbnailRatioUndefined: Self = StObject.set(x, "thumbnailRatio", js.undefined)
    
    inline def setUse(value: file | data): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
