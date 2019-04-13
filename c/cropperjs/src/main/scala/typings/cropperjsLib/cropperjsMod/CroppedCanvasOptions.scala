package typings
package cropperjsLib.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppedCanvasOptions extends js.Object {
  /**
    * a color to fill any alpha values in the output canvas
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the destination height of the output canvas
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * image smoothing
    */
  var imageSmoothingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var imageSmoothingQuality: js.UndefOr[
    cropperjsLib.cropperjsLibStrings.low | cropperjsLib.cropperjsLibStrings.medium | cropperjsLib.cropperjsLibStrings.high
  ] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * the destination width of the output canvas
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CroppedCanvasOptions {
  @scala.inline
  def apply(
    fillColor: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageSmoothingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageSmoothingQuality: cropperjsLib.cropperjsLibStrings.low | cropperjsLib.cropperjsLibStrings.medium | cropperjsLib.cropperjsLibStrings.high = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

