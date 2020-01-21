package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackSelected extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object AnonCallbackSelected {
  @scala.inline
  def apply(callback: js.Function = null, selected: Int | Double = null): AnonCallbackSelected = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackSelected]
  }
}

