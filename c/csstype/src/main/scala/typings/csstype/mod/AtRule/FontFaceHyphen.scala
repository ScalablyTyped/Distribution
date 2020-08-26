package typings.csstype.mod.AtRule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceHyphen[TLength, TTime] extends js.Object {
  var `-moz-font-feature-settings`: js.UndefOr[FontFeatureSettings] = js.native
  var `font-display`: js.UndefOr[FontDisplay] = js.native
  var `font-family`: js.UndefOr[String] = js.native
  var `font-feature-settings`: js.UndefOr[FontFeatureSettings] = js.native
  var `font-stretch`: js.UndefOr[FontStretch] = js.native
  var `font-style`: js.UndefOr[FontStyle] = js.native
  var `font-variant`: js.UndefOr[FontVariant] = js.native
  var `font-variation-settings`: js.UndefOr[FontVariationSettings] = js.native
  var `font-weight`: js.UndefOr[FontWeight] = js.native
  var src: js.UndefOr[String] = js.native
  var `unicode-range`: js.UndefOr[String] = js.native
}

object FontFaceHyphen {
  @scala.inline
  def apply[TLength, TTime](): FontFaceHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class FontFaceHyphenOps[Self <: FontFaceHyphen[_, _], TLength, TTime] (val x: Self with (FontFaceHyphen[TLength, TTime])) extends AnyVal {
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
    def `set-moz-font-feature-settings`(value: FontFeatureSettings): Self = this.set("-moz-font-feature-settings", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-font-feature-settings`: Self = this.set("-moz-font-feature-settings", js.undefined)
    @scala.inline
    def `setFont-display`(value: FontDisplay): Self = this.set("font-display", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-display`: Self = this.set("font-display", js.undefined)
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-feature-settings`(value: FontFeatureSettings): Self = this.set("font-feature-settings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-feature-settings`: Self = this.set("font-feature-settings", js.undefined)
    @scala.inline
    def `setFont-stretch`(value: FontStretch): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    @scala.inline
    def `setFont-style`(value: FontStyle): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-variant`(value: FontVariant): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    @scala.inline
    def `setFont-variation-settings`(value: FontVariationSettings): Self = this.set("font-variation-settings", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variation-settings`: Self = this.set("font-variation-settings", js.undefined)
    @scala.inline
    def `setFont-weight`(value: FontWeight): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def `setUnicode-range`(value: String): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-range`: Self = this.set("unicode-range", js.undefined)
  }
  
}

