package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaletteSpecimenProps extends StObject {
  
  var colors: js.Array[ColorSpecimenProps]
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
}
object ColorPaletteSpecimenProps {
  
  inline def apply(colors: js.Array[ColorSpecimenProps]): ColorPaletteSpecimenProps = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteSpecimenProps]
  }
  
  extension [Self <: ColorPaletteSpecimenProps](x: Self) {
    
    inline def setColors(value: js.Array[ColorSpecimenProps]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: ColorSpecimenProps*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
  }
}
