package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof csstype.csstype.AtRule.FontFace<TLength, TTime> ]: csstype.csstype.AtRule.FontFace<TLength, TTime>[P] | std.Array<csstype.csstype.AtRule.FontFace<TLength, TTime>[P]>} */
@js.native
trait FontFaceFallback[TLength, TTime] extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettings | js.Array[js.UndefOr[FontFeatureSettings]]] = js.native
  var fontDisplay: js.UndefOr[FontDisplay | js.Array[js.UndefOr[FontDisplay]]] = js.native
  var fontFamily: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings | js.Array[js.UndefOr[FontFeatureSettings]]] = js.native
  var fontStretch: js.UndefOr[FontStretch | js.Array[js.UndefOr[FontStretch]]] = js.native
  var fontStyle: js.UndefOr[FontStyle | js.Array[js.UndefOr[FontStyle]]] = js.native
  var fontVariant: js.UndefOr[FontVariant | js.Array[js.UndefOr[FontVariant]]] = js.native
  var fontVariationSettings: js.UndefOr[FontVariationSettings | js.Array[js.UndefOr[FontVariationSettings]]] = js.native
  var fontWeight: js.UndefOr[FontWeight | js.Array[js.UndefOr[FontWeight]]] = js.native
  var src: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
  var unicodeRange: js.UndefOr[String | js.Array[js.UndefOr[String]]] = js.native
}

object FontFaceFallback {
  @scala.inline
  def apply[TLength, TTime](): FontFaceFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class FontFaceFallbackOps[Self <: FontFaceFallback[_, _], TLength, TTime] (val x: Self with (FontFaceFallback[TLength, TTime])) extends AnyVal {
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
    def setMozFontFeatureSettingsVarargs(value: js.UndefOr[FontFeatureSettings]*): Self = this.set("MozFontFeatureSettings", js.Array(value :_*))
    @scala.inline
    def setMozFontFeatureSettings(value: FontFeatureSettings | js.Array[js.UndefOr[FontFeatureSettings]]): Self = this.set("MozFontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozFontFeatureSettings: Self = this.set("MozFontFeatureSettings", js.undefined)
    @scala.inline
    def setFontDisplayVarargs(value: js.UndefOr[FontDisplay]*): Self = this.set("fontDisplay", js.Array(value :_*))
    @scala.inline
    def setFontDisplay(value: FontDisplay | js.Array[js.UndefOr[FontDisplay]]): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    @scala.inline
    def setFontFamilyVarargs(value: js.UndefOr[String]*): Self = this.set("fontFamily", js.Array(value :_*))
    @scala.inline
    def setFontFamily(value: String | js.Array[js.UndefOr[String]]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontFeatureSettingsVarargs(value: js.UndefOr[FontFeatureSettings]*): Self = this.set("fontFeatureSettings", js.Array(value :_*))
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettings | js.Array[js.UndefOr[FontFeatureSettings]]): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    @scala.inline
    def setFontStretchVarargs(value: js.UndefOr[FontStretch]*): Self = this.set("fontStretch", js.Array(value :_*))
    @scala.inline
    def setFontStretch(value: FontStretch | js.Array[js.UndefOr[FontStretch]]): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyleVarargs(value: js.UndefOr[FontStyle]*): Self = this.set("fontStyle", js.Array(value :_*))
    @scala.inline
    def setFontStyle(value: FontStyle | js.Array[js.UndefOr[FontStyle]]): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariantVarargs(value: js.UndefOr[FontVariant]*): Self = this.set("fontVariant", js.Array(value :_*))
    @scala.inline
    def setFontVariant(value: FontVariant | js.Array[js.UndefOr[FontVariant]]): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontVariationSettingsVarargs(value: js.UndefOr[FontVariationSettings]*): Self = this.set("fontVariationSettings", js.Array(value :_*))
    @scala.inline
    def setFontVariationSettings(value: FontVariationSettings | js.Array[js.UndefOr[FontVariationSettings]]): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    @scala.inline
    def setFontWeightVarargs(value: js.UndefOr[FontWeight]*): Self = this.set("fontWeight", js.Array(value :_*))
    @scala.inline
    def setFontWeight(value: FontWeight | js.Array[js.UndefOr[FontWeight]]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setSrcVarargs(value: js.UndefOr[String]*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: String | js.Array[js.UndefOr[String]]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setUnicodeRangeVarargs(value: js.UndefOr[String]*): Self = this.set("unicodeRange", js.Array(value :_*))
    @scala.inline
    def setUnicodeRange(value: String | js.Array[js.UndefOr[String]]): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
  }
  
}

