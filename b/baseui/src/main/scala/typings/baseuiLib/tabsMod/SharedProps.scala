package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$disabled")
  var $disabled: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$orientation")
  var $orientation: js.UndefOr[baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical] = js.undefined
}

object SharedProps {
  @scala.inline
  def apply(
    $active: js.UndefOr[scala.Boolean] = js.undefined,
    $disabled: js.UndefOr[scala.Boolean] = js.undefined,
    $orientation: baseuiLib.baseuiLibStrings.horizontal | baseuiLib.baseuiLibStrings.vertical = null
  ): SharedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active)
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled)
    if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

