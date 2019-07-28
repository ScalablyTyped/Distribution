package typings.cropperjs.cropperjsMod

import typings.cropperjs.cropperjsStrings.high
import typings.cropperjs.cropperjsStrings.low
import typings.cropperjs.cropperjsStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppedCanvasOptions extends js.Object {
  /**
    * a color to fill any alpha values in the output canvas
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * the destination height of the output canvas
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * image smoothing
    */
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  var imageSmoothingQuality: js.UndefOr[low | medium | high] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * the destination width of the output canvas
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CroppedCanvasOptions {
  @scala.inline
  def apply(
    fillColor: String = null,
    height: Int | Double = null,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingQuality: low | medium | high = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    width: Int | Double = null
  ): CroppedCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled)
    if (imageSmoothingQuality != null) __obj.updateDynamic("imageSmoothingQuality")(imageSmoothingQuality.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CroppedCanvasOptions]
  }
}

