package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaKeywords
  extends BaseOptions[js.Any, js.Any] {
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object MetaKeywords {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    content: java.lang.String = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): MetaKeywords = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (content != null) __obj.updateDynamic("content")(content)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MetaKeywords]
  }
}

