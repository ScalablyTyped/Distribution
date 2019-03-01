package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFaceHyphenFallback extends js.Object {
  var `-moz-font-feature-settings`: js.UndefOr[
    csstypeLib.FontFaceFontFeatureSettingsProperty | js.Array[csstypeLib.FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  var `font-display`: js.UndefOr[
    csstypeLib.FontFaceFontDisplayProperty | js.Array[csstypeLib.FontFaceFontDisplayProperty]
  ] = js.undefined
  var `font-family`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `font-feature-settings`: js.UndefOr[
    csstypeLib.FontFaceFontFeatureSettingsProperty | js.Array[csstypeLib.FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  var `font-stretch`: js.UndefOr[
    csstypeLib.FontFaceFontStretchProperty | js.Array[csstypeLib.FontFaceFontStretchProperty]
  ] = js.undefined
  var `font-style`: js.UndefOr[
    csstypeLib.FontFaceFontStyleProperty | js.Array[csstypeLib.FontFaceFontStyleProperty]
  ] = js.undefined
  var `font-variant`: js.UndefOr[
    csstypeLib.FontFaceFontVariantProperty | js.Array[csstypeLib.FontFaceFontVariantProperty]
  ] = js.undefined
  var `font-variation-settings`: js.UndefOr[
    csstypeLib.FontFaceFontVariationSettingsProperty | js.Array[csstypeLib.FontFaceFontVariationSettingsProperty]
  ] = js.undefined
  var `font-weight`: js.UndefOr[
    csstypeLib.FontFaceFontWeightProperty | js.Array[csstypeLib.FontFaceFontWeightProperty]
  ] = js.undefined
  var src: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `unicode-range`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object FontFaceHyphenFallback {
  @scala.inline
  def apply(
    `-moz-font-feature-settings`: csstypeLib.FontFaceFontFeatureSettingsProperty | js.Array[csstypeLib.FontFaceFontFeatureSettingsProperty] = null,
    `font-display`: csstypeLib.FontFaceFontDisplayProperty | js.Array[csstypeLib.FontFaceFontDisplayProperty] = null,
    `font-family`: java.lang.String | js.Array[java.lang.String] = null,
    `font-feature-settings`: csstypeLib.FontFaceFontFeatureSettingsProperty | js.Array[csstypeLib.FontFaceFontFeatureSettingsProperty] = null,
    `font-stretch`: csstypeLib.FontFaceFontStretchProperty | js.Array[csstypeLib.FontFaceFontStretchProperty] = null,
    `font-style`: csstypeLib.FontFaceFontStyleProperty | js.Array[csstypeLib.FontFaceFontStyleProperty] = null,
    `font-variant`: csstypeLib.FontFaceFontVariantProperty | js.Array[csstypeLib.FontFaceFontVariantProperty] = null,
    `font-variation-settings`: csstypeLib.FontFaceFontVariationSettingsProperty | js.Array[csstypeLib.FontFaceFontVariationSettingsProperty] = null,
    `font-weight`: csstypeLib.FontFaceFontWeightProperty | js.Array[csstypeLib.FontFaceFontWeightProperty] = null,
    src: java.lang.String | js.Array[java.lang.String] = null,
    `unicode-range`: java.lang.String | js.Array[java.lang.String] = null
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

