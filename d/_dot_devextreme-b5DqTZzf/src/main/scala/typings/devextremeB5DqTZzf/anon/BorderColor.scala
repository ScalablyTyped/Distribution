package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor extends StObject {
  
  /**
    * An object defining the border properties for a selected series.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Sets a color for a series when it is selected.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the hatching properties to be applied when a point is selected.
    */
  var hatching: js.UndefOr[Direction] = js.undefined
}
object BorderColor {
  
  inline def apply(): BorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor]
  }
  
  extension [Self <: BorderColor](x: Self) {
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHatching(value: Direction): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
