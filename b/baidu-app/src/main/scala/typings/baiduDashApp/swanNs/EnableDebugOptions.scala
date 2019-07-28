package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
trait EnableDebugOptions
  extends BaseOptions[js.Any, js.Any] {
  var enableDebug: Boolean
}

object EnableDebugOptions {
  @scala.inline
  def apply(
    enableDebug: Boolean,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): EnableDebugOptions = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[EnableDebugOptions]
  }
}

