package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceHyphen extends StObject {
  
  var `-moz-font-feature-settings`: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  
  var `font-display`: js.UndefOr[FontFaceFontDisplayProperty] = js.undefined
  
  var `font-family`: js.UndefOr[String] = js.undefined
  
  var `font-feature-settings`: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  
  var `font-stretch`: js.UndefOr[FontFaceFontStretchProperty] = js.undefined
  
  var `font-style`: js.UndefOr[FontFaceFontStyleProperty] = js.undefined
  
  var `font-variant`: js.UndefOr[FontFaceFontVariantProperty] = js.undefined
  
  var `font-variation-settings`: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.undefined
  
  var `font-weight`: js.UndefOr[FontFaceFontWeightProperty] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `unicode-range`: js.UndefOr[String] = js.undefined
}
object FontFaceHyphen {
  
  @scala.inline
  def apply(): FontFaceHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphen]
  }
  
  @scala.inline
  implicit class FontFaceHyphenMutableBuilder[Self <: FontFaceHyphen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set-moz-font-feature-settings`(value: FontFaceFontFeatureSettingsProperty): Self = StObject.set(x, "-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-font-feature-settingsUndefined`: Self = StObject.set(x, "-moz-font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-display`(value: FontFaceFontDisplayProperty): Self = StObject.set(x, "font-display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-displayUndefined`: Self = StObject.set(x, "font-display", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-feature-settings`(value: FontFaceFontFeatureSettingsProperty): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-stretch`(value: FontFaceFontStretchProperty): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: FontFaceFontStyleProperty): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-variant`(value: FontFaceFontVariantProperty): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    @scala.inline
    def `setFont-variation-settings`(value: FontFaceFontVariationSettingsProperty): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: FontFaceFontWeightProperty): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def `setUnicode-range`(value: String): Self = StObject.set(x, "unicode-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-rangeUndefined`: Self = StObject.set(x, "unicode-range", js.undefined)
  }
}
