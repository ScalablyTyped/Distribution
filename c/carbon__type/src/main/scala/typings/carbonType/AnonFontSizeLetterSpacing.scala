package typings.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontSizeLetterSpacing extends js.Object {
  var fontSize: String
  var letterSpacing: String
  var lineHeight: String
}

object AnonFontSizeLetterSpacing {
  @scala.inline
  def apply(fontSize: String, letterSpacing: String, lineHeight: String): AnonFontSizeLetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontSizeLetterSpacing]
  }
}

