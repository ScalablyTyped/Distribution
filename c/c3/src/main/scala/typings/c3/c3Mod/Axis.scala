package typings.c3.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  /**
    * Switch x and y axis position.
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[XAxisConfiguration] = js.undefined
  var y: js.UndefOr[YAxisConfiguration] = js.undefined
  var y2: js.UndefOr[YAxisConfiguration] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    rotated: js.UndefOr[Boolean] = js.undefined,
    x: XAxisConfiguration = null,
    y: YAxisConfiguration = null,
    y2: YAxisConfiguration = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    if (y2 != null) __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Axis]
  }
}

