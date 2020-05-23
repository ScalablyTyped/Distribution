package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 画布标识，传入 <canvas/> 的 cavas-id
    */
  var canvasId: String
      // 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[Double] = js.undefined
      // 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[Double] = js.undefined
      // 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[String] = js.undefined
      // 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[Double] = js.undefined
      // 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
      // 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(
    canvasId: String,
    complete: /* res */ js.Any => Unit = null,
    destHeight: js.UndefOr[Double] = js.undefined,
    destWidth: js.UndefOr[Double] = js.undefined,
    fail: js.Any => Unit = null,
    fileType: String = null,
    height: js.UndefOr[Double] = js.undefined,
    success: js.Any => Unit = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(destHeight)) __obj.updateDynamic("destHeight")(destHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destWidth)) __obj.updateDynamic("destWidth")(destWidth.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
}

