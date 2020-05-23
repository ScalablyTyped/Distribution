package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selected extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object Selected {
  @scala.inline
  def apply(callback: js.Function = null, selected: js.UndefOr[Double] = js.undefined): Selected = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
}

