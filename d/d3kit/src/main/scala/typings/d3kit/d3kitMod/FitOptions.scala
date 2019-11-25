package typings.d3kit.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var height: js.UndefOr[String | Double] = js.undefined
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  var maxWidth: js.UndefOr[String | Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    height: String | Double = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    mode: String = null,
    ratio: Int | Double = null,
    width: String | Double = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
}

