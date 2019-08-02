package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTrueOptions
  extends CanvasOptions
     with CropOptions {
  var bottom: js.UndefOr[Double] = js.undefined
  var canvas: `true`
  var crop: js.UndefOr[Boolean] = js.undefined
  var downsamplingRatio: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var sourceHeight: js.UndefOr[Double] = js.undefined
  var sourceWidth: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object CanvasTrueOptions {
  @scala.inline
  def apply(
    canvas: `true`,
    bottom: Int | Double = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    downsamplingRatio: Int | Double = null,
    left: Int | Double = null,
    orientation: Orientation = null,
    pixelRatio: Int | Double = null,
    right: Int | Double = null,
    sourceHeight: Int | Double = null,
    sourceWidth: Int | Double = null,
    top: Int | Double = null
  ): CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (downsamplingRatio != null) __obj.updateDynamic("downsamplingRatio")(downsamplingRatio.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (sourceHeight != null) __obj.updateDynamic("sourceHeight")(sourceHeight.asInstanceOf[js.Any])
    if (sourceWidth != null) __obj.updateDynamic("sourceWidth")(sourceWidth.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTrueOptions]
  }
}

