package typings.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isMasked: js.UndefOr[Boolean] = js.undefined
}

object InternalState {
  @scala.inline
  def apply(isFocused: js.UndefOr[Boolean] = js.undefined, isMasked: js.UndefOr[Boolean] = js.undefined): InternalState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isMasked)) __obj.updateDynamic("isMasked")(isMasked.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalState]
  }
}

