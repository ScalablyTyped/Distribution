package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object Name {
  @scala.inline
  def apply(callback: js.Function = null, name: String = null, selected: js.UndefOr[Double] = js.undefined): Name = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

