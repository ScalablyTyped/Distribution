package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFalseOptions extends CanvasOptions {
  var canvas: js.UndefOr[`false`] = js.undefined
}

object CanvasFalseOptions {
  @scala.inline
  def apply(canvas: `false` = null): CanvasFalseOptions = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFalseOptions]
  }
}

