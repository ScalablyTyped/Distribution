package typings.baseui.dataTableMod

import typings.baseui.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowActionT extends js.Object {
  var label: String
  var renderIcon: js.Any
  def onClick(params: Event): js.Any
}

object RowActionT {
  @scala.inline
  def apply(label: String, onClick: Event => js.Any, renderIcon: js.Any): RowActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionT]
  }
}

