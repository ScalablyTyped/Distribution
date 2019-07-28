package typings.atCarbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontWeight extends js.Object {
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: String
  var lineHeight: String
}

object Anon_FontFamilyFontSizeFontWeight {
  @scala.inline
  def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: String,
    lineHeight: String
  ): Anon_FontFamilyFontSizeFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontSize = fontSize, fontWeight = fontWeight, letterSpacing = letterSpacing, lineHeight = lineHeight)
  
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontWeight]
  }
}

