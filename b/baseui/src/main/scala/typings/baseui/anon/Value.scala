package typings.baseui.anon

import typings.baseui.paginationMod.PageOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: js.Array[PageOption]
}

object Value {
  @scala.inline
  def apply(value: js.Array[PageOption]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

