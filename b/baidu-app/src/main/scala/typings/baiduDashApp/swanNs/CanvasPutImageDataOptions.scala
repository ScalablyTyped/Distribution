package typings.baiduDashApp.swanNs

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPutImageDataOptions extends CanvasImageDataOptions {
  var data: Uint8ClampedArray
}

object CanvasPutImageDataOptions {
  @scala.inline
  def apply(
    canvasId: String,
    data: Uint8ClampedArray,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId, data = data, height = height, width = width, x = x, y = y)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
}

