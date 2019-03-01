package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeightLetterSpacingNumber extends js.Object {
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: scala.Double
}

object Anon_FontFamilyFontSizeFontWeightLetterSpacingNumber {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: scala.Double
  ): Anon_FontFamilyFontSizeFontWeightLetterSpacingNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeightLetterSpacingNumber]
  }
}

