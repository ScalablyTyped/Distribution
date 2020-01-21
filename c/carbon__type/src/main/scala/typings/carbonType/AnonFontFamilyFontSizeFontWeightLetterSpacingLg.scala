package typings.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontFamilyFontSizeFontWeightLetterSpacingLg extends js.Object {
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: Double
  var lg: AnonFontSizeLineHeight
  var lineHeight: String
  var max: AnonFontSizeLineHeight
}

object AnonFontFamilyFontSizeFontWeightLetterSpacingLg {
  @scala.inline
  def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lg: AnonFontSizeLineHeight,
    lineHeight: String,
    max: AnonFontSizeLineHeight
  ): AnonFontFamilyFontSizeFontWeightLetterSpacingLg = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontFamilyFontSizeFontWeightLetterSpacingLg]
  }
}

