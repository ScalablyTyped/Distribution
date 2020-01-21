package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceFallback extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.undefined
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.undefined
  var fontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.undefined
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.undefined
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.undefined
  var fontVariationSettings: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.undefined
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.undefined
  var src: js.UndefOr[String | js.Array[String]] = js.undefined
  var unicodeRange: js.UndefOr[String | js.Array[String]] = js.undefined
}

object FontFaceFallback {
  @scala.inline
  def apply(
    MozFontFeatureSettings: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty] = null,
    fontDisplay: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty] = null,
    fontFamily: String | js.Array[String] = null,
    fontFeatureSettings: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty] = null,
    fontStretch: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty] = null,
    fontStyle: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty] = null,
    fontVariant: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty] = null,
    fontVariationSettings: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty] = null,
    fontWeight: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty] = null,
    src: String | js.Array[String] = null,
    unicodeRange: String | js.Array[String] = null
  ): FontFaceFallback = {
    val __obj = js.Dynamic.literal()
    if (MozFontFeatureSettings != null) __obj.updateDynamic("MozFontFeatureSettings")(MozFontFeatureSettings.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceFallback]
  }
}

