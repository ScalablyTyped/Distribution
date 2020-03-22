package typings.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineHeight extends js.Object {
  var fontSize: String
  var lineHeight: String
}

object AnonLineHeight {
  @scala.inline
  def apply(fontSize: String, lineHeight: String): AnonLineHeight = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLineHeight]
  }
}

