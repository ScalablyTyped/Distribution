package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityWidth extends StObject {
  
  /**
    * Specifies the color of the slider handles.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the opacity of the slider handles.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of the slider handles.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object OpacityWidth {
  
  inline def apply(): OpacityWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityWidth]
  }
  
  extension [Self <: OpacityWidth](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
