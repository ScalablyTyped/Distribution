package typings.baseui.tabsMod

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.undefined
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
}

object SharedProps {
  @scala.inline
  def apply(
    $active: js.UndefOr[Boolean] = js.undefined,
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $orientation: horizontal | vertical = null
  ): SharedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active.asInstanceOf[js.Any])
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.asInstanceOf[js.Any])
    if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

