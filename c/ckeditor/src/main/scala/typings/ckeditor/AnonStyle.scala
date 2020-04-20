package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var color: String
  var style: String
  var width: String
}

object AnonStyle {
  @scala.inline
  def apply(color: String, style: String, width: String): AnonStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

