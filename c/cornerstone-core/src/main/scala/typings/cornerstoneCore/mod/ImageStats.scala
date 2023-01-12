package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageStats extends StObject {
  
  /** The time in ms taken to retrieve stored pixels required to draw the image */
  var lastGetPixelDataTime: js.UndefOr[Double] = js.undefined
  
  /** The time in ms taken to generate the lookup table for the image */
  var lastLutGenerateTime: js.UndefOr[Double] = js.undefined
  
  /** The time in ms taken for putImageData to put the canvas pixel data into the canvas context */
  var lastPutImageDataTime: js.UndefOr[Double] = js.undefined
  
  /** The total time in ms taken for the entire rendering function to run */
  var lastRenderTime: js.UndefOr[Double] = js.undefined
  
  /** The time in ms taken to map from stored pixel array to canvas pixel array */
  var lastStoredPixelDataToCanvasImageDataTime: js.UndefOr[Double] = js.undefined
}
object ImageStats {
  
  inline def apply(): ImageStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageStats] (val x: Self) extends AnyVal {
    
    inline def setLastGetPixelDataTime(value: Double): Self = StObject.set(x, "lastGetPixelDataTime", value.asInstanceOf[js.Any])
    
    inline def setLastGetPixelDataTimeUndefined: Self = StObject.set(x, "lastGetPixelDataTime", js.undefined)
    
    inline def setLastLutGenerateTime(value: Double): Self = StObject.set(x, "lastLutGenerateTime", value.asInstanceOf[js.Any])
    
    inline def setLastLutGenerateTimeUndefined: Self = StObject.set(x, "lastLutGenerateTime", js.undefined)
    
    inline def setLastPutImageDataTime(value: Double): Self = StObject.set(x, "lastPutImageDataTime", value.asInstanceOf[js.Any])
    
    inline def setLastPutImageDataTimeUndefined: Self = StObject.set(x, "lastPutImageDataTime", js.undefined)
    
    inline def setLastRenderTime(value: Double): Self = StObject.set(x, "lastRenderTime", value.asInstanceOf[js.Any])
    
    inline def setLastRenderTimeUndefined: Self = StObject.set(x, "lastRenderTime", js.undefined)
    
    inline def setLastStoredPixelDataToCanvasImageDataTime(value: Double): Self = StObject.set(x, "lastStoredPixelDataToCanvasImageDataTime", value.asInstanceOf[js.Any])
    
    inline def setLastStoredPixelDataToCanvasImageDataTimeUndefined: Self = StObject.set(x, "lastStoredPixelDataToCanvasImageDataTime", js.undefined)
  }
}
