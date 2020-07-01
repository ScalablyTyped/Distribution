package typings.degit.mod

import typings.degit.degitStrings.clone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DegitAction extends Action {
  @JSName("action")
  var action_DegitAction: clone
  var src: String
}

object DegitAction {
  @scala.inline
  def apply(
    action: clone,
    src: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): DegitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DegitAction]
  }
}

