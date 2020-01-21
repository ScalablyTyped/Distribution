package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  @JSName("success")
  def success_MGetScreenBrightnessOptions(value: Double): Unit
}

object GetScreenBrightnessOptions {
  @scala.inline
  def apply(success: Double => Unit, complete: /* res */ js.Any => Unit = null, fail: js.Any => Unit = null): GetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetScreenBrightnessOptions]
  }
}

