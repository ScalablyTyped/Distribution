package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait widthAndHeight extends js.Object {
  var height: Double
  var width: Double
}

object widthAndHeight {
  @scala.inline
  def apply(height: Double, width: Double): widthAndHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[widthAndHeight]
  }
}

