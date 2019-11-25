package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageDataOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 画布标识，传入 <canvas /> 的 canvas-id  */
  var canvasId: String
  /** 将要被提取的图像数据矩形区域的高度 */
  var height: Double
  /** 将要被提取的图像数据矩形区域的宽度 */
  var width: Double
  /** 将要被提取的图像数据矩形区域的左上角 x 坐标 */
  var x: Double
  /** 将要被提取的图像数据矩形区域的左上角 y 坐标 */
  var y: Double
}

object CanvasImageDataOptions {
  @scala.inline
  def apply(
    canvasId: String,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): CanvasImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CanvasImageDataOptions]
  }
}

