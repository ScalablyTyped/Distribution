package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceHyphenFallback extends js.Object {
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
  @scala.inline
  def apply(
    `-moz-font-feature-settings`: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty] = null,
    `font-display`: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty] = null,
    `font-family`: String | js.Array[String] = null,
    `font-feature-settings`: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty] = null,
    `font-stretch`: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty] = null,
    `font-style`: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty] = null,
    `font-variant`: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty] = null,
    `font-variation-settings`: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty] = null,
    `font-weight`: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty] = null,
    src: String | js.Array[String] = null,
    `unicode-range`: String | js.Array[String] = null
  ): FontFaceHyphenFallback = {
    val __obj = js.Dynamic.literal()
    if (`-moz-font-feature-settings` != null) __obj.updateDynamic("-moz-font-feature-settings")(`-moz-font-feature-settings`.asInstanceOf[js.Any])
    if (`font-display` != null) __obj.updateDynamic("font-display")(`font-display`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-feature-settings` != null) __obj.updateDynamic("font-feature-settings")(`font-feature-settings`.asInstanceOf[js.Any])
    if (`font-stretch` != null) __obj.updateDynamic("font-stretch")(`font-stretch`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-variant` != null) __obj.updateDynamic("font-variant")(`font-variant`.asInstanceOf[js.Any])
    if (`font-variation-settings` != null) __obj.updateDynamic("font-variation-settings")(`font-variation-settings`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (`unicode-range` != null) __obj.updateDynamic("unicode-range")(`unicode-range`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceHyphenFallback]
  }
}

