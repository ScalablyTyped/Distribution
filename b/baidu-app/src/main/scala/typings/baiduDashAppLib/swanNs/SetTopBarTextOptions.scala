package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置置顶信息
trait SetTopBarTextOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 置顶栏文字内容
  		 */
  var text: java.lang.String
}

object SetTopBarTextOptions {
  @scala.inline
  def apply(
    text: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
}

