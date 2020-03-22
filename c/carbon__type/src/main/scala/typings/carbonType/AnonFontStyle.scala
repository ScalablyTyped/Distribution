package typings.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontStyle extends js.Object {
  var fontFamily: String
  var fontSize: String
  var fontStyle: String
  var letterSpacing: String
  var lineHeight: String
}

object AnonFontStyle {
  @scala.inline
  def apply(fontFamily: String, fontSize: String, fontStyle: String, letterSpacing: String, lineHeight: String): AnonFontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontStyle]
  }
}

