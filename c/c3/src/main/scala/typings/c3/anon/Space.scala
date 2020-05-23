package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space extends js.Object {
  /**
    * Set space between bars in bar charts
    */
  var space: js.UndefOr[Double] = js.undefined
  /**
    * Change the width of bars. If ratio is specified, change the width of bar chart by ratio.
    */
  var width: js.UndefOr[Double | Ratio] = js.undefined
  /**
    * Set if min or max value will be 0 on bar chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}

object Space {
  @scala.inline
  def apply(
    space: js.UndefOr[Double] = js.undefined,
    width: Double | Ratio = null,
    zerobased: js.UndefOr[Boolean] = js.undefined
  ): Space = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zerobased)) __obj.updateDynamic("zerobased")(zerobased.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
}

