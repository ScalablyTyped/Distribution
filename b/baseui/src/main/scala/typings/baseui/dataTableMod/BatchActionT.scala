package typings.baseui.dataTableMod

import typings.baseui.AnonClearSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchActionT extends js.Object {
  var label: String
  var renderIcon: js.UndefOr[js.Any] = js.undefined
  def onClick(params: AnonClearSelection): js.Any
}

object BatchActionT {
  @scala.inline
  def apply(label: String, onClick: AnonClearSelection => js.Any, renderIcon: js.Any = null): BatchActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(renderIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchActionT]
  }
}

