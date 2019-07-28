package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 对机动车驾驶证所有关键字段进行识别。
		 */
trait ocrDrivingLicenseOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片资源地址
  var detect_direction: js.UndefOr[Boolean] = js.undefined
  var image: String
   // true: 归一化格式输出;false 或无此参数按非归一化格式输出。
  @JSName("success")
  var success_ocrDrivingLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrDrivingLicenseResponse, Unit]] = js.undefined
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true;false:不检测旋转角度，默认不检测。
  var unified_valid_period: js.UndefOr[Boolean] = js.undefined
}

object ocrDrivingLicenseOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    detect_direction: js.UndefOr[Boolean] = js.undefined,
    fail: js.Any => Unit = null,
    success: /* res */ ocrDrivingLicenseResponse => Unit = null,
    unified_valid_period: js.UndefOr[Boolean] = js.undefined
  ): ocrDrivingLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(detect_direction)) __obj.updateDynamic("detect_direction")(detect_direction)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (!js.isUndefined(unified_valid_period)) __obj.updateDynamic("unified_valid_period")(unified_valid_period)
    __obj.asInstanceOf[ocrDrivingLicenseOptions]
  }
}

