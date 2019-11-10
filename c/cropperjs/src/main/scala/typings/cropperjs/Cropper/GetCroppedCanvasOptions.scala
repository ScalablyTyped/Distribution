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
    height: Int | Double = null,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingQuality: ImageSmoothingQuality = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    width: Int | Double = null
  ): GetCroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled)
    if (imageSmoothingQuality != null) __obj.updateDynamic("imageSmoothingQuality")(imageSmoothingQuality)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCroppedCanvasOptions]
  }
}

