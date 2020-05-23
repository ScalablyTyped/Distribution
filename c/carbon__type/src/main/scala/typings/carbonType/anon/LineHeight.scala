package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeight extends js.Object {
  var fontSize: String
  var lineHeight: String
}

object LineHeight {
  @scala.inline
  def apply(fontSize: String, lineHeight: String): LineHeight = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

