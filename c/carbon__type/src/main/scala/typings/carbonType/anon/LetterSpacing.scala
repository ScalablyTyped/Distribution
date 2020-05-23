package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterSpacing extends js.Object {
  var fontSize: String
  var letterSpacing: String
  var lineHeight: String
}

object LetterSpacing {
  @scala.inline
  def apply(fontSize: String, letterSpacing: String, lineHeight: String): LetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacing]
  }
}

