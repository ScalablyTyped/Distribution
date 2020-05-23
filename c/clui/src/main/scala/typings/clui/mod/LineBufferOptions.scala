package typings.clui.mod

import typings.clui.cluiStrings.console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineBufferOptions extends js.Object {
  var height: js.UndefOr[Double | console] = js.undefined
  var scroll: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | console] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object LineBufferOptions {
  @scala.inline
  def apply(
    height: Double | console = null,
    scroll: js.UndefOr[Double] = js.undefined,
    width: Double | console = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): LineBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBufferOptions]
  }
}

