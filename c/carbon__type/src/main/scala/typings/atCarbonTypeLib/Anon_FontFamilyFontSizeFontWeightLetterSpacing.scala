package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeightLetterSpacing extends js.Object {
  var `@media (min-width: 42rem)`: Anon_FontSizeLineHeight
  var `@media (min-width: 66rem)`: Anon_FontSizeLetterSpacing
  var `@media (min-width: 82rem)`: Anon_FontSizeLineHeight
  var `@media (min-width: 99rem)`: Anon_FontSizeLetterSpacing
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: scala.Double
  var lineHeight: java.lang.String
}

object Anon_FontFamilyFontSizeFontWeightLetterSpacing {
  @scala.inline
  def apply(
    `@media (min-width: 42rem)`: Anon_FontSizeLineHeight,
    `@media (min-width: 66rem)`: Anon_FontSizeLetterSpacing,
    `@media (min-width: 82rem)`: Anon_FontSizeLineHeight,
    `@media (min-width: 99rem)`: Anon_FontSizeLetterSpacing,
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: scala.Double,
    lineHeight: java.lang.String
  ): Anon_FontFamilyFontSizeFontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(`@media (min-width: 42rem)` = `@media (min-width: 42rem)`, `@media (min-width: 66rem)` = `@media (min-width: 66rem)`, `@media (min-width: 82rem)` = `@media (min-width: 82rem)`, `@media (min-width: 99rem)` = `@media (min-width: 99rem)`)
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeightLetterSpacing]
  }
}

