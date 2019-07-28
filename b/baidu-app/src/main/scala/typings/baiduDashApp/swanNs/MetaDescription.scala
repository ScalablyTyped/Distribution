package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDescription
  extends BaseOptions[js.Any, js.Any] {
  var content: js.UndefOr[String] = js.undefined
}

object MetaDescription {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    content: String = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): MetaDescription = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (content != null) __obj.updateDynamic("content")(content)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MetaDescription]
  }
}

