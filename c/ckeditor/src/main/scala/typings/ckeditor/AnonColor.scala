package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var unprocessed: String
}

object AnonColor {
  @scala.inline
  def apply(color: String, unprocessed: String): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

