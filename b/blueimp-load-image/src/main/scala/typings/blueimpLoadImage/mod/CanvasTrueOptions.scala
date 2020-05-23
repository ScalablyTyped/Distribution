package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTrueOptions extends CanvasOptions {
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
    bottom: js.UndefOr[Double] = js.undefined,
    crop: js.UndefOr[Boolean] = js.undefined,
    downsamplingRatio: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    orientation: Orientation = null,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    sourceHeight: js.UndefOr[Double] = js.undefined,
    sourceWidth: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downsamplingRatio)) __obj.updateDynamic("downsamplingRatio")(downsamplingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceHeight)) __obj.updateDynamic("sourceHeight")(sourceHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceWidth)) __obj.updateDynamic("sourceWidth")(sourceWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTrueOptions]
  }
}

