package typings.babylonjs

import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyExternalImage extends StObject {
  
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  var origin: js.UndefOr[GPUOrigin2D] = js.undefined
  
  var source: ImageBitmap | HTMLVideoElement | HTMLCanvasElement | OffscreenCanvas
}
object GPUImageCopyExternalImage {
  
  inline def apply(source: ImageBitmap | HTMLVideoElement | HTMLCanvasElement | OffscreenCanvas): GPUImageCopyExternalImage = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyExternalImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyExternalImage] (val x: Self) extends AnyVal {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setOrigin(value: GPUOrigin2D): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setSource(value: ImageBitmap | HTMLVideoElement | HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
