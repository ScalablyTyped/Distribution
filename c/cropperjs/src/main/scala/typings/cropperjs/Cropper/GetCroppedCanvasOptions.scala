package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCroppedCanvasOptions extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  var imageSmoothingQuality: js.UndefOr[ImageSmoothingQuality] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GetCroppedCanvasOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingQuality: ImageSmoothingQuality = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): GetCroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled.get.asInstanceOf[js.Any])
    if (imageSmoothingQuality != null) __obj.updateDynamic("imageSmoothingQuality")(imageSmoothingQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCroppedCanvasOptions]
  }
}

