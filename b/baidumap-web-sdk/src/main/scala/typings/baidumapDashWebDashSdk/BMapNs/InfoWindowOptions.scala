package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  var enableAutoPan: js.UndefOr[Boolean] = js.undefined
  var enableCloseOnClick: js.UndefOr[Boolean] = js.undefined
  var enableMessage: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    enableAutoPan: js.UndefOr[Boolean] = js.undefined,
    enableCloseOnClick: js.UndefOr[Boolean] = js.undefined,
    enableMessage: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    maxWidth: Int | Double = null,
    message: String = null,
    offset: Size = null,
    title: String = null,
    width: Int | Double = null
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

