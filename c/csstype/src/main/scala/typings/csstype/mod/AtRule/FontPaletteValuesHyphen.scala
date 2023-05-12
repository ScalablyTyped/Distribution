package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontPaletteValuesHyphen[TLength, TTime] extends StObject {
  
  var `base-palette`: js.UndefOr[BasePalette] = js.undefined
  
  var `font-family`: js.UndefOr[String] = js.undefined
  
  var `override-colors`: js.UndefOr[String] = js.undefined
}
object FontPaletteValuesHyphen {
  
  inline def apply[TLength, TTime](): FontPaletteValuesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontPaletteValuesHyphen[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontPaletteValuesHyphen[?, ?], TLength, TTime] (val x: Self & (FontPaletteValuesHyphen[TLength, TTime])) extends AnyVal {
    
    inline def `setBase-palette`(value: BasePalette): Self = StObject.set(x, "base-palette", value.asInstanceOf[js.Any])
    
    inline def `setBase-paletteUndefined`: Self = StObject.set(x, "base-palette", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setOverride-colors`(value: String): Self = StObject.set(x, "override-colors", value.asInstanceOf[js.Any])
    
    inline def `setOverride-colorsUndefined`: Self = StObject.set(x, "override-colors", js.undefined)
  }
}
