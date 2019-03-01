package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndZoomToolOptions extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var followText: js.UndefOr[java.lang.String] = js.undefined
  var zoomType: js.UndefOr[ZoomType] = js.undefined
}

object DragAndZoomToolOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    followText: java.lang.String = null,
    zoomType: js.UndefOr[ZoomType] = js.undefined
  ): DragAndZoomToolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (followText != null) __obj.updateDynamic("followText")(followText)
    if (!js.isUndefined(zoomType)) __obj.updateDynamic("zoomType")(zoomType)
    __obj.asInstanceOf[DragAndZoomToolOptions]
  }
}

