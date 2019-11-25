package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置置顶信息
trait SetTopBarTextOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 置顶栏文字内容
  		 */
  var text: String
}

object SetTopBarTextOptions {
  @scala.inline
  def apply(
    text: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
}

