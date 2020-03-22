package typings.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFontWeight extends js.Object {
  var fontFamily: String
  var fontSize: String
  var fontWeight: Double
  var letterSpacing: Double
}

object AnonFontWeight {
  @scala.inline
  def apply(fontFamily: String, fontSize: String, fontWeight: Double, letterSpacing: Double): AnonFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFontWeight]
  }
}

