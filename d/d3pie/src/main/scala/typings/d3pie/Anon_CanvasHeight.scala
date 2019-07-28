package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanvasHeight extends js.Object {
  var canvasHeight: js.UndefOr[Double] = js.undefined
  var canvasWidth: js.UndefOr[Double] = js.undefined
  var pieInnerRadius: js.UndefOr[String | Double] = js.undefined
  var pieOuterRadius: js.UndefOr[String | Double] = js.undefined
}

object Anon_CanvasHeight {
  @scala.inline
  def apply(
    canvasHeight: Int | Double = null,
    canvasWidth: Int | Double = null,
    pieInnerRadius: String | Double = null,
    pieOuterRadius: String | Double = null
  ): Anon_CanvasHeight = {
    val __obj = js.Dynamic.literal()
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (pieInnerRadius != null) __obj.updateDynamic("pieInnerRadius")(pieInnerRadius.asInstanceOf[js.Any])
    if (pieOuterRadius != null) __obj.updateDynamic("pieOuterRadius")(pieOuterRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanvasHeight]
  }
}

