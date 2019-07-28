package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * The padding on the bottom of the chart.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * The padding on the left of the chart.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The padding on the right of the chart.
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * The padding on the top of the chart.
    */
  var top: js.UndefOr[Double] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

