package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFace extends js.Object {
  
  var MozFontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.native
  
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.native
  
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty] = js.native
  
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty] = js.native
  
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty] = js.native
  
  var fontVariationSettings: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.native
  
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var unicodeRange: js.UndefOr[String] = js.native
}
object FontFace {
  
  @scala.inline
  def apply(): FontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit class FontFaceOps[Self <: FontFace] (val x: Self) extends AnyVal {
    
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
    def setMozFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty): Self = this.set("MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozFontFeatureSettings: Self = this.set("MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontDisplay(value: FontFaceFontDisplayProperty): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontFaceFontStretchProperty): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontFaceFontStyleProperty): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontFaceFontVariantProperty): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariationSettings(value: FontFaceFontVariationSettingsProperty): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontFaceFontWeightProperty): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
  }
}
