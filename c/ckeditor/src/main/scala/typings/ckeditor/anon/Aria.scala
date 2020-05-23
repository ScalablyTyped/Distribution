package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aria extends js.Object {
  var aria: js.Array[String]
  var display: js.Array[String]
}

object Aria {
  @scala.inline
  def apply(aria: js.Array[String], display: js.Array[String]): Aria = {
    val __obj = js.Dynamic.literal(aria = aria.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aria]
  }
}

