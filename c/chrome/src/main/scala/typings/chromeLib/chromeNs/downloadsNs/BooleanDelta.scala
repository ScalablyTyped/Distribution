package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanDelta extends js.Object {
  var current: js.UndefOr[scala.Boolean] = js.undefined
  var previous: js.UndefOr[scala.Boolean] = js.undefined
}

object BooleanDelta {
  @scala.inline
  def apply(
    current: js.UndefOr[scala.Boolean] = js.undefined,
    previous: js.UndefOr[scala.Boolean] = js.undefined
  ): BooleanDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[BooleanDelta]
  }
}

