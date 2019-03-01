package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var margins: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

object ViewportOptions {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    margins: js.Array[scala.Double] = null,
    zoomFactor: scala.Int | scala.Double = null
  ): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (margins != null) __obj.updateDynamic("margins")(margins)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportOptions]
  }
}

