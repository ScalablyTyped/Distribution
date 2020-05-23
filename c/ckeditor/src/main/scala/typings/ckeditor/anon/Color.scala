package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var unprocessed: String
}

object Color {
  @scala.inline
  def apply(color: String, unprocessed: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

