package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontPaletteValues[TLength, TTime] extends StObject {
  
  var basePalette: js.UndefOr[BasePalette] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var overrideColors: js.UndefOr[String] = js.undefined
}
object FontPaletteValues {
  
  inline def apply[TLength, TTime](): FontPaletteValues[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontPaletteValues[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontPaletteValues[?, ?], TLength, TTime] (val x: Self & (FontPaletteValues[TLength, TTime])) extends AnyVal {
    
    inline def setBasePalette(value: BasePalette): Self = StObject.set(x, "basePalette", value.asInstanceOf[js.Any])
    
    inline def setBasePaletteUndefined: Self = StObject.set(x, "basePalette", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setOverrideColors(value: String): Self = StObject.set(x, "overrideColors", value.asInstanceOf[js.Any])
    
    inline def setOverrideColorsUndefined: Self = StObject.set(x, "overrideColors", js.undefined)
  }
}
