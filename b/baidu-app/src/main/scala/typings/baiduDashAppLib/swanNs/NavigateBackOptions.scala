package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 返回的页面数，如果 delta 大于现有页面数，则返回到首页。 */
  var delta: scala.Double
}

object NavigateBackOptions {
  @scala.inline
  def apply(
    delta: scala.Double,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): NavigateBackOptions = {
    val __obj = js.Dynamic.literal(delta = delta)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateBackOptions]
  }
}

