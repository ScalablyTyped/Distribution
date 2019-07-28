package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadSubPackageOptions
  extends BaseOptions[js.Any, js.Any] {
  var root: String
}

object LoadSubPackageOptions {
  @scala.inline
  def apply(
    root: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): LoadSubPackageOptions = {
    val __obj = js.Dynamic.literal(root = root)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[LoadSubPackageOptions]
  }
}

