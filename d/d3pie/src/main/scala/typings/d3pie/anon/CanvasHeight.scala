package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasHeight extends js.Object {
  var canvasHeight: js.UndefOr[Double] = js.undefined
  var canvasWidth: js.UndefOr[Double] = js.undefined
  var pieInnerRadius: js.UndefOr[String | Double] = js.undefined
  var pieOuterRadius: js.UndefOr[String | Double] = js.undefined
}

object CanvasHeight {
  @scala.inline
  def apply(
    canvasHeight: js.UndefOr[Double] = js.undefined,
    canvasWidth: js.UndefOr[Double] = js.undefined,
    pieInnerRadius: String | Double = null,
    pieOuterRadius: String | Double = null
  ): CanvasHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canvasHeight)) __obj.updateDynamic("canvasHeight")(canvasHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canvasWidth)) __obj.updateDynamic("canvasWidth")(canvasWidth.get.asInstanceOf[js.Any])
    if (pieInnerRadius != null) __obj.updateDynamic("pieInnerRadius")(pieInnerRadius.asInstanceOf[js.Any])
    if (pieOuterRadius != null) __obj.updateDynamic("pieOuterRadius")(pieOuterRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasHeight]
  }
}

