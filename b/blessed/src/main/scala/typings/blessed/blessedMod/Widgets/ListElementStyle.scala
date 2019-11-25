package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElementStyle extends js.Object {
  var item: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
}

object ListElementStyle {
  @scala.inline
  def apply(item: js.Any = null, selected: js.Any = null): ListElementStyle = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElementStyle]
  }
}

