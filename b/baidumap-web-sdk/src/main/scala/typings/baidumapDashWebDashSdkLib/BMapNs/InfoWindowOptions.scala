package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  var enableAutoPan: js.UndefOr[scala.Boolean] = js.undefined
  var enableCloseOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var enableMessage: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    enableAutoPan: js.UndefOr[scala.Boolean] = js.undefined,
    enableCloseOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    enableMessage: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    offset: Size = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoPan)) __obj.updateDynamic("enableAutoPan")(enableAutoPan)
    if (!js.isUndefined(enableCloseOnClick)) __obj.updateDynamic("enableCloseOnClick")(enableCloseOnClick)
    if (!js.isUndefined(enableMessage)) __obj.updateDynamic("enableMessage")(enableMessage)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
}

