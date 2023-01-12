package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscodedPixels extends StObject {
  
  var height: Double
  
  var transcodedPixels: js.typedarray.ArrayBufferView
  
  var width: Double
}
object TranscodedPixels {
  
  inline def apply(height: Double, transcodedPixels: js.typedarray.ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranscodedPixels] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTranscodedPixels(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "transcodedPixels", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
