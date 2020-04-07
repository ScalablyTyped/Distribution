package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  @JSName("$selected")
  var $selected: js.UndefOr[Boolean] = js.undefined
}

object AnonDisabled {
  @scala.inline
  def apply(
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    $selected: js.UndefOr[Boolean] = js.undefined
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.asInstanceOf[js.Any])
    if (!js.isUndefined($selected)) __obj.updateDynamic("$selected")($selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

