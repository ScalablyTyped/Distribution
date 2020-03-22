package typings.chartJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in chart.js.chart.js.PositionType ]:? number} */
trait keyinPositionTypenumber extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var chartArea: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object keyinPositionTypenumber {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    chartArea: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): keyinPositionTypenumber = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinPositionTypenumber]
  }
}

