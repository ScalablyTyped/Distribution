package typings.chartJs.mod

import typings.chartJs.typesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonHoverOptions extends StObject {
  
  var hoverBackgroundColor: Color
  
  var hoverBorderColor: Color
  
  var hoverBorderWidth: Double
}
object CommonHoverOptions {
  
  inline def apply(hoverBackgroundColor: Color, hoverBorderColor: Color, hoverBorderWidth: Double): CommonHoverOptions = {
    val __obj = js.Dynamic.literal(hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonHoverOptions]
  }
  
  extension [Self <: CommonHoverOptions](x: Self) {
    
    inline def setHoverBackgroundColor(value: Color): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColor(value: Color): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidth(value: Double): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
  }
}
