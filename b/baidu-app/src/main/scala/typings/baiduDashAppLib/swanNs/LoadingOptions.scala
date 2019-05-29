package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: java.lang.String
}

object LoadingOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Any => scala.Unit = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LoadingOptions]
  }
}

