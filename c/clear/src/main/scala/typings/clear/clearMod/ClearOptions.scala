package typings.clear.clearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOptions extends js.Object {
  /**
    * Setting this to false will prevent this module from clearing the screen.
    * This will not remove anything from the screen, but instead move your cursor
    * to position 0,0. Much like printing a \r instead of a \n to reset the current line of output.
    *
    * @default true
    */
  var fullClear: js.UndefOr[Boolean] = js.undefined
}

object ClearOptions {
  @scala.inline
  def apply(fullClear: js.UndefOr[Boolean] = js.undefined): ClearOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullClear)) __obj.updateDynamic("fullClear")(fullClear)
    __obj.asInstanceOf[ClearOptions]
  }
}

