package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  @JSName("$disabled")
  var $disabled: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$selected")
  var $selected: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    $disabled: js.UndefOr[scala.Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[scala.Boolean] = js.undefined,
    $selected: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($disabled)) __obj.updateDynamic("$disabled")($disabled)
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted)
    if (!js.isUndefined($selected)) __obj.updateDynamic("$selected")($selected)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

