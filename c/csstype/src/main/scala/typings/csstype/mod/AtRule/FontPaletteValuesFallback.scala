package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.FontPaletteValues<TLength, TTime>> */
trait FontPaletteValuesFallback[TLength, TTime] extends StObject {
  
  var basePalette: js.UndefOr[BasePalette | js.Array[NonNullable[js.UndefOr[BasePalette]]]] = js.undefined
  
  var fontFamily: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var overrideColors: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
}
object FontPaletteValuesFallback {
  
  inline def apply[TLength, TTime](): FontPaletteValuesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontPaletteValuesFallback[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontPaletteValuesFallback[?, ?], TLength, TTime] (val x: Self & (FontPaletteValuesFallback[TLength, TTime])) extends AnyVal {
    
    inline def setBasePalette(value: BasePalette | js.Array[NonNullable[js.UndefOr[BasePalette]]]): Self = StObject.set(x, "basePalette", value.asInstanceOf[js.Any])
    
    inline def setBasePaletteUndefined: Self = StObject.set(x, "basePalette", js.undefined)
    
    inline def setBasePaletteVarargs(value: NonNullable[js.UndefOr[BasePalette]]*): Self = StObject.set(x, "basePalette", js.Array(value*))
    
    inline def setFontFamily(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "fontFamily", js.Array(value*))
    
    inline def setOverrideColors(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "overrideColors", value.asInstanceOf[js.Any])
    
    inline def setOverrideColorsUndefined: Self = StObject.set(x, "overrideColors", js.undefined)
    
    inline def setOverrideColorsVarargs(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "overrideColors", js.Array(value*))
  }
}
