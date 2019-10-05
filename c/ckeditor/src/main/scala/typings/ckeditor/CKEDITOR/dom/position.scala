package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait position extends js.Object {
  var x: Double
  var y: Double
}

object position {
  @scala.inline
  def apply(x: Double, y: Double): position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[position]
  }
}

