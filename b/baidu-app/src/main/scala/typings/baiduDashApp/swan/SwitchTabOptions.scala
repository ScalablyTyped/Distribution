package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTabOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要跳转的 tabBar 页面的路径
  		 * （需在 app.json 的 tabBar 字段定义的页面），路径后不能带参数
  		 */
  var url: String
}

object SwitchTabOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SwitchTabOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SwitchTabOptions]
  }
}

