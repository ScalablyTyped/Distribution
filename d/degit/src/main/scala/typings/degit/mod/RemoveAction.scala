package typings.degit.mod

import typings.degit.degitStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAction extends Action {
  @JSName("action")
  var action_RemoveAction: remove
  var files: js.Array[String]
}

object RemoveAction {
  @scala.inline
  def apply(
    action: remove,
    files: js.Array[String],
    cache: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): RemoveAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
}

