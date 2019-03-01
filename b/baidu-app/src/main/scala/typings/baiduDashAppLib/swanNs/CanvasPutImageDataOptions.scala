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
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
}

