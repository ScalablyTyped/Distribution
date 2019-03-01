package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontSizeFontStyle extends js.Object {
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontStyle: java.lang.String
  var letterSpacing: java.lang.String
  var lineHeight: java.lang.String
}

object Anon_FontFamilyFontSizeFontStyle {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontStyle: java.lang.String,
    letterSpacing: java.lang.String,
    lineHeight: java.lang.String
  ): Anon_FontFamilyFontSizeFontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontStyle")(fontStyle)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.asInstanceOf[Anon_FontFamilyFontSizeFontStyle]
  }
}

