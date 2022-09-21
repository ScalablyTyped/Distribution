package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFace[TLength, TTime] extends StObject {
  
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.undefined
  
  var ascentOverride: js.UndefOr[AscentOverride] = js.undefined
  
  var descentOverride: js.UndefOr[DescentOverride] = js.undefined
  
  var fontDisplay: js.UndefOr[FontDisplay] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.undefined
  
  var fontStretch: js.UndefOr[FontStretch] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var fontVariant: js.UndefOr[FontVariant] = js.undefined
  
  var fontVariationSettings: js.UndefOr[FontVariationSettings] = js.undefined
  
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  var lineGapOverride: js.UndefOr[LineGapOverride] = js.undefined
  
  var sizeAdjust: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var unicodeRange: js.UndefOr[String] = js.undefined
}
object FontFace {
  
  inline def apply[TLength, TTime](): FontFace[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace[TLength, TTime]]
  }
  
  extension [Self <: FontFace[?, ?], TLength, TTime](x: Self & (FontFace[TLength, TTime])) {
    
    inline def setAscentOverride(value: AscentOverride): Self = StObject.set(x, "ascentOverride", value.asInstanceOf[js.Any])
    
    inline def setAscentOverrideUndefined: Self = StObject.set(x, "ascentOverride", js.undefined)
    
    inline def setDescentOverride(value: DescentOverride): Self = StObject.set(x, "descentOverride", value.asInstanceOf[js.Any])
    
    inline def setDescentOverrideUndefined: Self = StObject.set(x, "descentOverride", js.undefined)
    
    inline def setFontDisplay(value: FontDisplay): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
    
    inline def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    inline def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontVariationSettings(value: FontVariationSettings): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLineGapOverride(value: LineGapOverride): Self = StObject.set(x, "lineGapOverride", value.asInstanceOf[js.Any])
    
    inline def setLineGapOverrideUndefined: Self = StObject.set(x, "lineGapOverride", js.undefined)
    
    inline def setMozFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
    
    inline def setSizeAdjust(value: String): Self = StObject.set(x, "sizeAdjust", value.asInstanceOf[js.Any])
    
    inline def setSizeAdjustUndefined: Self = StObject.set(x, "sizeAdjust", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
  }
}
