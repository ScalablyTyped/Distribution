package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----导航
trait NavigateToOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要跳转的应用内页面的路径 */
  var url: java.lang.String
}

object NavigateToOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): NavigateToOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[NavigateToOptions]
  }
}

