package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.Array[Any]
  
  var layout: js.Array[Any]
  
  var `type`: js.Array[Any]
}
object Colors {
  
  inline def apply(colors: js.Array[Any], layout: js.Array[Any], `type`: js.Array[Any]): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Any*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setLayout(value: js.Array[Any]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutVarargs(value: Any*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
