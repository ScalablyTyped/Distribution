package typings.baseui.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait initialState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var isIndeterminate: js.UndefOr[Boolean] = js.undefined
}

object initialState {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined, isIndeterminate: js.UndefOr[Boolean] = js.undefined): initialState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[initialState]
  }
}

