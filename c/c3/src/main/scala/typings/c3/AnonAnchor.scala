package typings.c3

import typings.c3.c3Strings.`bottom-left`
import typings.c3.c3Strings.`bottom-right`
import typings.c3.c3Strings.`top-left`
import typings.c3.c3Strings.`top-right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchor extends js.Object {
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

object AnonAnchor {
  @scala.inline
  def apply(
    anchor: `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    step: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonAnchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchor]
  }
}

