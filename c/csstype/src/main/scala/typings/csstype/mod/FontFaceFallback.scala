package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceFallback extends js.Object {
  
  var MozFontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.native
  
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.native
  
  var fontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.native
  
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.native
  
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.native
  
  var fontVariationSettings: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.native
  
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.native
  
  var src: js.UndefOr[String | js.Array[String]] = js.native
  
  var unicodeRange: js.UndefOr[String | js.Array[String]] = js.native
}
object FontFaceFallback {
  
  @scala.inline
  def apply(): FontFaceFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceFallback]
  }
  
  @scala.inline
  implicit class FontFaceFallbackOps[Self <: FontFaceFallback] (val x: Self) extends AnyVal {
    
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
    def setMozFontFeatureSettingsVarargs(value: FontFaceFontFeatureSettingsProperty*): Self = this.set("MozFontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def setMozFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = this.set("MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozFontFeatureSettings: Self = this.set("MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontDisplayVarargs(value: FontFaceFontDisplayProperty*): Self = this.set("fontDisplay", js.Array(value :_*))
    
    @scala.inline
    def setFontDisplay(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    
    @scala.inline
    def setFontFamilyVarargs(value: String*): Self = this.set("fontFamily", js.Array(value :_*))
    
    @scala.inline
    def setFontFamily(value: String | js.Array[String]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettingsVarargs(value: FontFaceFontFeatureSettingsProperty*): Self = this.set("fontFeatureSettings", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontStretchVarargs(value: FontFaceFontStretchProperty*): Self = this.set("fontStretch", js.Array(value :_*))
    
    @scala.inline
    def setFontStretch(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyleVarargs(value: FontFaceFontStyleProperty*): Self = this.set("fontStyle", js.Array(value :_*))
    
    @scala.inline
    def setFontStyle(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariantVarargs(value: FontFaceFontVariantProperty*): Self = this.set("fontVariant", js.Array(value :_*))
    
    @scala.inline
    def setFontVariant(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariationSettingsVarargs(value: FontFaceFontVariationSettingsProperty*): Self = this.set("fontVariationSettings", js.Array(value :_*))
    
    @scala.inline
    def setFontVariationSettings(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeightVarargs(value: FontFaceFontWeightProperty*): Self = this.set("fontWeight", js.Array(value :_*))
    
    @scala.inline
    def setFontWeight(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setUnicodeRangeVarargs(value: String*): Self = this.set("unicodeRange", js.Array(value :_*))
    
    @scala.inline
    def setUnicodeRange(value: String | js.Array[String]): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
  }
}
