package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceHyphenFallback extends js.Object {
  
  var `-moz-font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  
  var `font-display`: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.native
  
  var `font-family`: js.UndefOr[String | js.Array[String]] = js.native
  
  var `font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  
  var `font-stretch`: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.native
  
  var `font-style`: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.native
  
  var `font-variant`: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.native
  
  var `font-variation-settings`: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.native
  
  var `font-weight`: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.native
  
  var src: js.UndefOr[String | js.Array[String]] = js.native
  
  var `unicode-range`: js.UndefOr[String | js.Array[String]] = js.native
}
object FontFaceHyphenFallback {
  
  @scala.inline
  def apply(): FontFaceHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphenFallback]
  }
  
  @scala.inline
  implicit class FontFaceHyphenFallbackOps[Self <: FontFaceHyphenFallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `set-moz-font-feature-settingsVarargs`(value: FontFaceFontFeatureSettingsProperty*): Self = this.set("-moz-font-feature-settings", js.Array(value :_*))
    
    @scala.inline
    def `set-moz-font-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = this.set("-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-font-feature-settings`: Self = this.set("-moz-font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-displayVarargs`(value: FontFaceFontDisplayProperty*): Self = this.set("font-display", js.Array(value :_*))
    
    @scala.inline
    def `setFont-display`(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = this.set("font-display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-display`: Self = this.set("font-display", js.undefined)
    
    @scala.inline
    def `setFont-familyVarargs`(value: String*): Self = this.set("font-family", js.Array(value :_*))
    
    @scala.inline
    def `setFont-family`(value: String | js.Array[String]): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-feature-settingsVarargs`(value: FontFaceFontFeatureSettingsProperty*): Self = this.set("font-feature-settings", js.Array(value :_*))
    
    @scala.inline
    def `setFont-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = this.set("font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-feature-settings`: Self = this.set("font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-stretchVarargs`(value: FontFaceFontStretchProperty*): Self = this.set("font-stretch", js.Array(value :_*))
    
    @scala.inline
    def `setFont-stretch`(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-styleVarargs`(value: FontFaceFontStyleProperty*): Self = this.set("font-style", js.Array(value :_*))
    
    @scala.inline
    def `setFont-style`(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    
    @scala.inline
    def `setFont-variantVarargs`(value: FontFaceFontVariantProperty*): Self = this.set("font-variant", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant`(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    
    @scala.inline
    def `setFont-variation-settingsVarargs`(value: FontFaceFontVariationSettingsProperty*): Self = this.set("font-variation-settings", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variation-settings`(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = this.set("font-variation-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variation-settings`: Self = this.set("font-variation-settings", js.undefined)
    
    @scala.inline
    def `setFont-weightVarargs`(value: FontFaceFontWeightProperty*): Self = this.set("font-weight", js.Array(value :_*))
    
    @scala.inline
    def `setFont-weight`(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def `setUnicode-rangeVarargs`(value: String*): Self = this.set("unicode-range", js.Array(value :_*))
    
    @scala.inline
    def `setUnicode-range`(value: String | js.Array[String]): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUnicode-range`: Self = this.set("unicode-range", js.undefined)
  }
}
