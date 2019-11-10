package typings.cropperjs.Cropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDataOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object SetDataOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    rotate: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SetDataOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataOptions]
  }
}

