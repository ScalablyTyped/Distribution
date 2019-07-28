package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOptions extends js.Object {
  var keepFocus: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[String] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
}

object KeyOptions {
  @scala.inline
  def apply(
    keepFocus: js.UndefOr[Boolean] = js.undefined,
    modifiers: String = null,
    reset: js.UndefOr[Boolean] = js.undefined
  ): KeyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[KeyOptions]
  }
}

