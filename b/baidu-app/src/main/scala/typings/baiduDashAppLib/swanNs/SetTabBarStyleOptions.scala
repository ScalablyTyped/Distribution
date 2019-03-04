package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarStyleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** tab 的背景色 */
  var backgroundColor: java.lang.String
  /** tabbar上边框的颜色， 仅支持 black/white */
  var borderStyle: java.lang.String
  /** tab 上的文字默认颜色 */
  var color: java.lang.String
  /** tab 上的文字选中时的颜色 */
  var selectedColor: java.lang.String
}

object SetTabBarStyleOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    borderStyle: java.lang.String,
    color: java.lang.String,
    selectedColor: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetTabBarStyleOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, borderStyle = borderStyle, color = color, selectedColor = selectedColor)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetTabBarStyleOptions]
  }
}

