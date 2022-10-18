package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotcolorMod.Color3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var alphaFilter: Double
  
  var buffer: js.typedarray.Uint8Array
  
  var bufferHeight: Double
  
  var bufferWidth: Double
  
  var colorFilter: Color3
  
  var height: Double
  
  var maxHeight: Double
  
  var minHeight: Double
  
  var subdivisions: Double
  
  var width: Double
}
object Buffer {
  
  inline def apply(
    alphaFilter: Double,
    buffer: js.typedarray.Uint8Array,
    bufferHeight: Double,
    bufferWidth: Double,
    colorFilter: Color3,
    height: Double,
    maxHeight: Double,
    minHeight: Double,
    subdivisions: Double,
    width: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(alphaFilter = alphaFilter.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferHeight = bufferHeight.asInstanceOf[js.Any], bufferWidth = bufferWidth.asInstanceOf[js.Any], colorFilter = colorFilter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  extension [Self <: Buffer](x: Self) {
    
    inline def setAlphaFilter(value: Double): Self = StObject.set(x, "alphaFilter", value.asInstanceOf[js.Any])
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferHeight(value: Double): Self = StObject.set(x, "bufferHeight", value.asInstanceOf[js.Any])
    
    inline def setBufferWidth(value: Double): Self = StObject.set(x, "bufferWidth", value.asInstanceOf[js.Any])
    
    inline def setColorFilter(value: Color3): Self = StObject.set(x, "colorFilter", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
