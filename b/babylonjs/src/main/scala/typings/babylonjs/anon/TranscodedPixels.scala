package typings.babylonjs.anon

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscodedPixels extends StObject {
  
  var height: Double
  
  var transcodedPixels: ArrayBufferView
  
  var width: Double
}
object TranscodedPixels {
  
  inline def apply(height: Double, transcodedPixels: ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
  
  extension [Self <: TranscodedPixels](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTranscodedPixels(value: ArrayBufferView): Self = StObject.set(x, "transcodedPixels", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
