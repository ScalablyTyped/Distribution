package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 画布标识，传入 <canvas/> 的 cavas-id
  		 */
  var canvasId: java.lang.String
  	// 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[scala.Double] = js.undefined
  	// 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[scala.Double] = js.undefined
  	// 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  	// 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[scala.Double] = js.undefined
  	// 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  	// 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[scala.Double] = js.undefined
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    destHeight: scala.Int | scala.Double = null,
    destWidth: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    fileType: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    success: js.Function1[js.Any, scala.Unit] = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
}

