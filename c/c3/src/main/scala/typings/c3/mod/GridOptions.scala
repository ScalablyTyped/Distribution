package typings.c3.mod

import typings.c3.anon.Front
import typings.c3.anon.Show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var focus: js.UndefOr[Show] = js.undefined
  var lines: js.UndefOr[Front] = js.undefined
  var x: js.UndefOr[AxisGridOptions] = js.undefined
  var y: js.UndefOr[AxisGridOptions] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(focus: Show = null, lines: Front = null, x: AxisGridOptions = null, y: AxisGridOptions = null): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

