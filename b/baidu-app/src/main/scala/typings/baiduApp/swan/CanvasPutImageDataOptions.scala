package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPutImageDataOptions
  extends StObject
     with CanvasImageDataOptions {
  
  var data: js.typedarray.Uint8ClampedArray
}
object CanvasPutImageDataOptions {
  
  inline def apply(
    canvasId: String,
    data: js.typedarray.Uint8ClampedArray,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
  
  extension [Self <: CanvasPutImageDataOptions](x: Self) {
    
    inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
