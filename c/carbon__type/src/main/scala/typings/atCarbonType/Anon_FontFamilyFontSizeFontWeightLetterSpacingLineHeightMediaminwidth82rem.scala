package typings.atCarbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeightLetterSpacingLineHeightMediaminwidth82rem extends js.Object {
  var `@media (min-width: 82rem)`: Anon_FontSizeLineHeight
  var `@media (min-width: 99rem)`: Anon_FontSize
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: Double
  var lineHeight: String
}

object Anon_FontFamilyFontSizeFontWeightLetterSpacingLineHeightMediaminwidth82rem {
  @scala.inline
  def apply(
    `@media (min-width: 82rem)`: Anon_FontSizeLineHeight,
    `@media (min-width: 99rem)`: Anon_FontSize,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): Anon_FontFamilyFontSizeFontWeightLetterSpacingLineHeightMediaminwidth82rem = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontSize = fontSize, fontWeight = fontWeight, letterSpacing = letterSpacing, lineHeight = lineHeight)
    __obj.updateDynamic("@media (min-width: 82rem)")(`@media (min-width: 82rem)`)
    __obj.updateDynamic("@media (min-width: 99rem)")(`@media (min-width: 99rem)`)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeightLetterSpacingLineHeightMediaminwidth82rem]
  }
}

