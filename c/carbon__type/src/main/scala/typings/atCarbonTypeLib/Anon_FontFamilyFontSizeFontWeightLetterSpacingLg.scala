package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeightLetterSpacingLg extends js.Object {
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: scala.Double
  var lg: Anon_FontSizeLineHeight
  var lineHeight: java.lang.String
  var max: Anon_FontSizeLineHeight
}

object Anon_FontFamilyFontSizeFontWeightLetterSpacingLg {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: scala.Double,
    lg: Anon_FontSizeLineHeight,
    lineHeight: java.lang.String,
    max: Anon_FontSizeLineHeight
  ): Anon_FontFamilyFontSizeFontWeightLetterSpacingLg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lg")(lg)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.updateDynamic("max")(max)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeightLetterSpacingLg]
  }
}

