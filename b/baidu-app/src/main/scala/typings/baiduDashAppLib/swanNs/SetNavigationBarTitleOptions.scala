package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置导航条
trait SetNavigationBarTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 页面标题 */
  var title: java.lang.String
}

object SetNavigationBarTitleOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetNavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetNavigationBarTitleOptions]
  }
}

