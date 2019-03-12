package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarBadgeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * tabBar的哪一项，从左边算起
  		 */
  var index: scala.Double
  /**
  		 * 显示的文本，超过 3 个字符则显示成“…”
  		 */
  var text: java.lang.String
}

object SetTabBarBadgeOptions {
  @scala.inline
  def apply(
    index: scala.Double,
    text: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): SetTabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index, text = text)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTabBarBadgeOptions]
  }
}

