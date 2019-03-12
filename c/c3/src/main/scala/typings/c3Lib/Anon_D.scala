package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_D extends js.Object {
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var grouped: js.UndefOr[scala.Boolean] = js.undefined
  var isselectable: js.UndefOr[js.Function1[/* d */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_D {
  @scala.inline
  def apply(
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    grouped: js.UndefOr[scala.Boolean] = js.undefined,
    isselectable: /* d */ js.UndefOr[js.Any] => scala.Boolean = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_D = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (isselectable != null) __obj.updateDynamic("isselectable")(js.Any.fromFunction1(isselectable))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    __obj.asInstanceOf[Anon_D]
  }
}

