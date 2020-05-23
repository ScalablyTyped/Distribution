package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontStyle extends js.Object {
  var fontFamily: String
  var fontSize: String
  var fontStyle: String
  var letterSpacing: String
  var lineHeight: String
}

object FontStyle {
  @scala.inline
  def apply(fontFamily: String, fontSize: String, fontStyle: String, letterSpacing: String, lineHeight: String): FontStyle = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
}

