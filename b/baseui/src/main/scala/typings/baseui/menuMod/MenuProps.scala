package typings.baseui.menuMod

import typings.baseui.AnonEmptyState
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends BaseMenuPropsT {
  var overrides: js.UndefOr[AnonEmptyState] = js.undefined
  var size: js.UndefOr[default_ | compact] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    overrides: AnonEmptyState = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

