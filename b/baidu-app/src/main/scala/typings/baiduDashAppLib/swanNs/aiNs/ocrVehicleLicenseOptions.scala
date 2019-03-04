package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 对机动车行驶证正本所有关键字段进行识别
		 */
trait ocrVehicleLicenseOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 是否检测图像旋转，可检验图像的选装方向和旋转角度。true：检测旋转角度并矫正识别。针对摆放情况不可控制的情况建议本参数置为true; false:不检测旋转角度，默认不检测。
  var accuracy: js.UndefOr[java.lang.String] = js.undefined
   // 图片资源地址
  var detect_direction: js.UndefOr[scala.Boolean] = js.undefined
  var image: java.lang.String
   // normal 使用快速服务，1200ms左右时延；缺省或其它值使用高精度服务，1600ms左右时延。
  @JSName("success")
  var success_ocrVehicleLicenseOptions: js.UndefOr[js.Function1[/* res */ ocrVehicleLicenseResponse, scala.Unit]] = js.undefined
}

object ocrVehicleLicenseOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    accuracy: java.lang.String = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    detect_direction: js.UndefOr[scala.Boolean] = js.undefined,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ ocrVehicleLicenseResponse, scala.Unit] = null
  ): ocrVehicleLicenseOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (!js.isUndefined(detect_direction)) __obj.updateDynamic("detect_direction")(detect_direction)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ocrVehicleLicenseOptions]
  }
}

