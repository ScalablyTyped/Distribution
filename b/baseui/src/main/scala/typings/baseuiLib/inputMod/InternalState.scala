package typings
package baseuiLib.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalState extends js.Object {
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
}

object InternalState {
  @scala.inline
  def apply(isFocused: js.UndefOr[scala.Boolean] = js.undefined): InternalState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    __obj.asInstanceOf[InternalState]
  }
}

