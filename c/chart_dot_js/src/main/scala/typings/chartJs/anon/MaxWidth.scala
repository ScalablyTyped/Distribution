package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidth extends StObject {
  
  var maxWidth: Double
  
  var rotation: Double
  
  var titleX: Any
  
  var titleY: Any
}
object MaxWidth {
  
  inline def apply(maxWidth: Double, rotation: Double, titleX: Any, titleY: Any): MaxWidth = {
    val __obj = js.Dynamic.literal(maxWidth = maxWidth.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], titleX = titleX.asInstanceOf[js.Any], titleY = titleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxWidth] (val x: Self) extends AnyVal {
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setTitleX(value: Any): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
    
    inline def setTitleY(value: Any): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
  }
}
