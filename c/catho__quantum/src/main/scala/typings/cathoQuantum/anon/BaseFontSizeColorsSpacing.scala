package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeColorsSpacing extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object BaseFontSizeColorsSpacing {
  
  inline def apply(): BaseFontSizeColorsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSizeColorsSpacing]
  }
  
  extension [Self <: BaseFontSizeColorsSpacing](x: Self) {
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    inline def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
