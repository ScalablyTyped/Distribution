package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarStyleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** tab 的背景色 */
  var backgroundColor: String
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: String
  /** tab 上的文字默认颜色 */
  var color: String
  /** tab 上的文字选中时的颜色 */
  var selectedColor: String
}

object SetTabBarStyleOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderStyle: String,
    color: String,
    selectedColor: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderStyle = borderStyle, color = color, selectedColor = selectedColor)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
}

