package typings.c3.anon

import typings.c3.c3Strings.`bottom-left`
import typings.c3.c3Strings.`bottom-right`
import typings.c3.c3Strings.`top-left`
import typings.c3.c3Strings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  /**
    * Decides the position of the legend.
    * Defaults to `"top-left"`.
    */
  var anchor: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.undefined
  /**
    * Defines the max step the legend has (e.g. If `step=2` and legend has 3 items, the legend has 2 columns).
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Set the horizontal position of the legend based on the anchor.
    * Defaults to `10`.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Set the vertical position of the legend based on the anchor.
    * Defaults to `0`.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Anchor {
  @scala.inline
  def apply(
    anchor: `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    step: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Anchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

