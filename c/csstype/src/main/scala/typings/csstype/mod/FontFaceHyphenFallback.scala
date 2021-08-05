package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceHyphenFallback extends StObject {
  
  var `-moz-font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  
  var `font-display`: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.undefined
  
  var `font-family`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  
  var `font-stretch`: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.undefined
  
  var `font-style`: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.undefined
  
  var `font-variant`: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.undefined
  
  var `font-variation-settings`: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.undefined
  
  var `font-weight`: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.undefined
  
  var src: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `unicode-range`: js.UndefOr[String | js.Array[String]] = js.undefined
}
object FontFaceHyphenFallback {
  
  inline def apply(): FontFaceHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphenFallback]
  }
  
  extension [Self <: FontFaceHyphenFallback](x: Self) {
    
    inline def `set-moz-font-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = StObject.set(x, "-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    inline def `set-moz-font-feature-settingsUndefined`: Self = StObject.set(x, "-moz-font-feature-settings", js.undefined)
    
    inline def `set-moz-font-feature-settingsVarargs`(value: FontFaceFontFeatureSettingsProperty*): Self = StObject.set(x, "-moz-font-feature-settings", js.Array(value :_*))
    
    inline def `setFont-display`(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = StObject.set(x, "font-display", value.asInstanceOf[js.Any])
    
    inline def `setFont-displayUndefined`: Self = StObject.set(x, "font-display", js.undefined)
    
    inline def `setFont-displayVarargs`(value: FontFaceFontDisplayProperty*): Self = StObject.set(x, "font-display", js.Array(value :_*))
    
    inline def `setFont-family`(value: String | js.Array[String]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-familyVarargs`(value: String*): Self = StObject.set(x, "font-family", js.Array(value :_*))
    
    inline def `setFont-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
    
    inline def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
    
    inline def `setFont-feature-settingsVarargs`(value: FontFaceFontFeatureSettingsProperty*): Self = StObject.set(x, "font-feature-settings", js.Array(value :_*))
    
    inline def `setFont-stretch`(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    inline def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    inline def `setFont-stretchVarargs`(value: FontFaceFontStretchProperty*): Self = StObject.set(x, "font-stretch", js.Array(value :_*))
    
    inline def `setFont-style`(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-styleVarargs`(value: FontFaceFontStyleProperty*): Self = StObject.set(x, "font-style", js.Array(value :_*))
    
    inline def `setFont-variant`(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    inline def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    inline def `setFont-variantVarargs`(value: FontFaceFontVariantProperty*): Self = StObject.set(x, "font-variant", js.Array(value :_*))
    
    inline def `setFont-variation-settings`(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
    
    inline def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
    
    inline def `setFont-variation-settingsVarargs`(value: FontFaceFontVariationSettingsProperty*): Self = StObject.set(x, "font-variation-settings", js.Array(value :_*))
    
    inline def `setFont-weight`(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def `setFont-weightVarargs`(value: FontFaceFontWeightProperty*): Self = StObject.set(x, "font-weight", js.Array(value :_*))
    
    inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    
    inline def `setUnicode-range`(value: String | js.Array[String]): Self = StObject.set(x, "unicode-range", value.asInstanceOf[js.Any])
    
    inline def `setUnicode-rangeUndefined`: Self = StObject.set(x, "unicode-range", js.undefined)
    
    inline def `setUnicode-rangeVarargs`(value: String*): Self = StObject.set(x, "unicode-range", js.Array(value :_*))
  }
}
