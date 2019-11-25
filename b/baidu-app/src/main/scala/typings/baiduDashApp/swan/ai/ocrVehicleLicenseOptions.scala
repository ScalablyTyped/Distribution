package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 对机动车行驶证正本所有关键字段进行识别
		 */
trait ocrVehicleLicenseOptions
  extends BaseOptions[js.Any, js.Any] {
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false:不检测旋转角度，默认不检测。
  var accuracy: js.UndefOr[String] = js.undefined
   // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
  var image: String
   // normal 使用快速服务，1200ms左右时延；缺省或其它值使用高精度服务，1600ms左右时延。
  @JSName("success")
  var success_ocrVehicleLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrVehicleLicenseResponse, Unit]] = js.undefined
}

object ocrVehicleLicenseOptions {
  @scala.inline
  def apply(
    image: String,
    accuracy: String = null,
    complete: /* res */ js.Any => Unit = null,
    detect_direction: js.UndefOr[Boolean] = js.undefined,
    fail: js.Any => Unit = null,
    success: /* res */ ocrVehicleLicenseResponse => Unit = null
  ): ocrVehicleLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(detect_direction)) __obj.updateDynamic("detect_direction")(detect_direction.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ocrVehicleLicenseOptions]
  }
}

