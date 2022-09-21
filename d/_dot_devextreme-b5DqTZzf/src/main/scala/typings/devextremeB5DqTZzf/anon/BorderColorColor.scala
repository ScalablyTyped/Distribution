package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorColor extends StObject {
  
  /**
    * Specifies a color for the background border.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a color for the background.
    */
  var color: js.UndefOr[String] = js.undefined
}
object BorderColorColor {
  
  inline def apply(): BorderColorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorColor]
  }
  
  extension [Self <: BorderColorColor](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
