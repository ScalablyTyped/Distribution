package typings.csstype.mod.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.FontPaletteValuesHyphen<TLength, TTime>> */
trait FontPaletteValuesHyphenFallback[TLength, TTime] extends StObject {
  
  var `base-palette`: js.UndefOr[BasePalette | js.Array[NonNullable[js.UndefOr[BasePalette]]]] = js.undefined
  
  var `font-family`: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
  
  var `override-colors`: js.UndefOr[String | js.Array[NonNullable[js.UndefOr[String]]]] = js.undefined
}
object FontPaletteValuesHyphenFallback {
  
  inline def apply[TLength, TTime](): FontPaletteValuesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontPaletteValuesHyphenFallback[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontPaletteValuesHyphenFallback[?, ?], TLength, TTime] (val x: Self & (FontPaletteValuesHyphenFallback[TLength, TTime])) extends AnyVal {
    
    inline def `setBase-palette`(value: BasePalette | js.Array[NonNullable[js.UndefOr[BasePalette]]]): Self = StObject.set(x, "base-palette", value.asInstanceOf[js.Any])
    
    inline def `setBase-paletteUndefined`: Self = StObject.set(x, "base-palette", js.undefined)
    
    inline def `setBase-paletteVarargs`(value: NonNullable[js.UndefOr[BasePalette]]*): Self = StObject.set(x, "base-palette", js.Array(value*))
    
    inline def `setFont-family`(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-familyVarargs`(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "font-family", js.Array(value*))
    
    inline def `setOverride-colors`(value: String | js.Array[NonNullable[js.UndefOr[String]]]): Self = StObject.set(x, "override-colors", value.asInstanceOf[js.Any])
    
    inline def `setOverride-colorsUndefined`: Self = StObject.set(x, "override-colors", js.undefined)
    
    inline def `setOverride-colorsVarargs`(value: NonNullable[js.UndefOr[String]]*): Self = StObject.set(x, "override-colors", js.Array(value*))
  }
}
