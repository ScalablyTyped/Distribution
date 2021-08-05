package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadow extends StObject {
  
  var blurRadius: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[InputColor] = js.undefined
  
  /**
    * 2d array for x and y offset. Defaults to [0, 0]
    */
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
}
object TextShadow {
  
  inline def apply(): TextShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadow]
  }
  
  extension [Self <: TextShadow](x: Self) {
    
    inline def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    inline def setColor(value: InputColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
