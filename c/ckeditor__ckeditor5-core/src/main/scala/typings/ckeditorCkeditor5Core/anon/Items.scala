package typings.ckeditorCkeditor5Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.Array[String]
  var viewportTopOffset: Double
}

object Items {
  @scala.inline
  def apply(items: js.Array[String], viewportTopOffset: Double): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], viewportTopOffset = viewportTopOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

