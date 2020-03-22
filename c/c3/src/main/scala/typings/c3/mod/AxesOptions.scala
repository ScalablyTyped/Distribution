package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesOptions extends js.Object {
  /**
    * Switch x and y axis position.
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  /** x axis configuration. */
  var x: js.UndefOr[XAxisConfiguration] = js.undefined
  /** y axis configuration. */
  var y: js.UndefOr[YAxisConfigurationWithTime] = js.undefined
  /** y2 axis configuration. */
  var y2: js.UndefOr[YAxisConfiguration] = js.undefined
}

object AxesOptions {
  @scala.inline
  def apply(
    rotated: js.UndefOr[Boolean] = js.undefined,
    x: XAxisConfiguration = null,
    y: YAxisConfigurationWithTime = null,
    y2: YAxisConfiguration = null
  ): AxesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesOptions]
  }
}

