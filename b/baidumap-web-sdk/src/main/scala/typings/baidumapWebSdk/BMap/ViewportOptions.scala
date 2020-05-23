package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  var margins: js.UndefOr[js.Array[Double]] = js.undefined
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object ViewportOptions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    margins: js.Array[Double] = null,
    zoomFactor: js.UndefOr[Double] = js.undefined
  ): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomFactor)) __obj.updateDynamic("zoomFactor")(zoomFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportOptions]
  }
}

