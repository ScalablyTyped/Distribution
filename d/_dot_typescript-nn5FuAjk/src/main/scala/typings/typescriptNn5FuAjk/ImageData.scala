package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData() and getImageData(). It can also be used to set a part of the canvas by using putImageData(). */
trait ImageData
  extends StObject
     with ImageBitmapSource
     with TexImageSource {
  
  val colorSpace: PredefinedColorSpace
  
  /** Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255. */
  val data: Uint8ClampedArray
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  val height: Double
  
  /** Returns the actual dimensions of the data in the ImageData object, in pixels. */
  val width: Double
}
object ImageData {
  
  inline def apply(colorSpace: PredefinedColorSpace, data: Uint8ClampedArray, height: Double, width: Double): ImageData = {
    val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  
  extension [Self <: ImageData](x: Self) {
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setData(value: Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
