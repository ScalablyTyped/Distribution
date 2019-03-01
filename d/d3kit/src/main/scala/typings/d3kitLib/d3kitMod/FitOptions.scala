package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    height: java.lang.String | scala.Double = null,
    maxHeight: java.lang.String | scala.Double = null,
    maxWidth: java.lang.String | scala.Double = null,
    mode: java.lang.String = null,
    ratio: scala.Int | scala.Double = null,
    width: java.lang.String | scala.Double = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
}

