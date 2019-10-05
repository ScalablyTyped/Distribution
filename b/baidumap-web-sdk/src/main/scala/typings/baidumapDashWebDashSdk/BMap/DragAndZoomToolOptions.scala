package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndZoomToolOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var followText: js.UndefOr[String] = js.undefined
  var zoomType: js.UndefOr[ZoomType] = js.undefined
}

object DragAndZoomToolOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    followText: String = null,
    zoomType: Int | Double = null
  ): DragAndZoomToolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (followText != null) __obj.updateDynamic("followText")(followText)
    if (zoomType != null) __obj.updateDynamic("zoomType")(zoomType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAndZoomToolOptions]
  }
}

