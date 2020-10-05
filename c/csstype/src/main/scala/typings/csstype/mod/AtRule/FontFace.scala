package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFace[TLength, TTime] extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  var fontDisplay: js.UndefOr[FontDisplay] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  var fontStretch: js.UndefOr[FontStretch] = js.native
  var fontStyle: js.UndefOr[FontStyle] = js.native
  var fontVariant: js.UndefOr[FontVariant] = js.native
  var fontVariationSettings: js.UndefOr[FontVariationSettings] = js.native
  var fontWeight: js.UndefOr[FontWeight] = js.native
  var src: js.UndefOr[String] = js.native
  var unicodeRange: js.UndefOr[String] = js.native
}

object FontFace {
  @scala.inline
  def apply[TLength, TTime](): FontFace[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace[TLength, TTime]]
  }
  @scala.inline
  implicit class FontFaceOps[Self <: FontFace[_, _], TLength, TTime] (val x: Self with (FontFace[TLength, TTime])) extends AnyVal {
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
    def setMozFontFeatureSettings(value: FontFeatureSettings): Self = this.set("MozFontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozFontFeatureSettings: Self = this.set("MozFontFeatureSettings", js.undefined)
    @scala.inline
    def setFontDisplay(value: FontDisplay): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettings): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    @scala.inline
    def setFontStretch(value: FontStretch): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariant(value: FontVariant): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontVariationSettings(value: FontVariationSettings): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
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

