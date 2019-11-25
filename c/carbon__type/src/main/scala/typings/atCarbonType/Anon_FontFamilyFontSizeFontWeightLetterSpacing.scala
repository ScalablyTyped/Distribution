package typings.atCarbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeightLetterSpacing extends js.Object {
  var `@media (min-width: 42rem)`: Anon_FontSize
  var `@media (min-width: 66rem)`: Anon_FontSize
  var `@media (min-width: 82rem)`: Anon_FontSizeLineHeight
  var `@media (min-width: 99rem)`: Anon_FontSizeLineHeight
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: Double
  var lineHeight: String
}

object Anon_FontFamilyFontSizeFontWeightLetterSpacing {
  @scala.inline
  def apply(
    `@media (min-width: 42rem)`: Anon_FontSize,
    `@media (min-width: 66rem)`: Anon_FontSize,
    `@media (min-width: 82rem)`: Anon_FontSizeLineHeight,
    `@media (min-width: 99rem)`: Anon_FontSizeLineHeight,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): Anon_FontFamilyFontSizeFontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 42rem)")(`@media (min-width: 42rem)`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 66rem)")(`@media (min-width: 66rem)`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 82rem)")(`@media (min-width: 82rem)`.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 99rem)")(`@media (min-width: 99rem)`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeightLetterSpacing]
  }
}

