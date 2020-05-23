package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCanvasDataOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SetCanvasDataOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SetCanvasDataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCanvasDataOptions]
  }
}

