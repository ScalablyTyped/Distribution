package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOptions extends js.Object {
  var keepFocus: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[java.lang.String] = js.undefined
  var reset: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyOptions {
  @scala.inline
  def apply(
    keepFocus: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: java.lang.String = null,
    reset: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[KeyOptions]
  }
}

