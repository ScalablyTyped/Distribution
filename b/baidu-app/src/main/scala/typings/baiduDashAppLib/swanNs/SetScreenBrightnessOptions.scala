package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// 设备-----屏幕亮度
trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  var value: scala.Double
}

object SetScreenBrightnessOptions {
  @scala.inline
  def apply(
    value: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
}

