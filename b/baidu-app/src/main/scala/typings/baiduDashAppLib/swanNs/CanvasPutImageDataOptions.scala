package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPutImageDataOptions extends CanvasImageDataOptions {
  var data: stdLib.Uint8ClampedArray
}

object CanvasPutImageDataOptions {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    data: stdLib.Uint8ClampedArray,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId, data = data, height = height, width = width, x = x, y = y)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
}

