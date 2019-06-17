package typings
package baseuiLib.progressDashStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isActive")
  var $isActive: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isCompleted")
  var $isCompleted: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleProps {
  @scala.inline
  def apply(
    $disabled: js.UndefOr[scala.Boolean] = js.undefined,
    $isActive: js.UndefOr[scala.Boolean] = js.undefined,
    $isCompleted: js.UndefOr[scala.Boolean] = js.undefined
  ): StyleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled)
    if (!js.isUndefined($isActive)) __obj.updateDynamic("$isActive")($isActive)
    if (!js.isUndefined($isCompleted)) __obj.updateDynamic("$isCompleted")($isCompleted)
    __obj.asInstanceOf[StyleProps]
  }
}

