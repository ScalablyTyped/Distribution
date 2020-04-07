package typings.baseui.progressStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$isActive")
  var $isActive: js.UndefOr[Boolean] = js.undefined
  @JSName("$isCompleted")
  var $isCompleted: js.UndefOr[Boolean] = js.undefined
}

object StyleProps {
  @scala.inline
  def apply(
    $disabled: js.UndefOr[Boolean] = js.undefined,
    $isActive: js.UndefOr[Boolean] = js.undefined,
    $isCompleted: js.UndefOr[Boolean] = js.undefined
  ): StyleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled.asInstanceOf[js.Any])
    if (!js.isUndefined($isActive)) __obj.updateDynamic("$isActive")($isActive.asInstanceOf[js.Any])
    if (!js.isUndefined($isCompleted)) __obj.updateDynamic("$isCompleted")($isCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
}

