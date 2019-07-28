package typings.baiduDashApp.swanNs

import typings.baiduDashApp.baiduDashAppStrings.game
import typings.baiduDashApp.baiduDashAppStrings.normal
import typings.baiduDashApp.baiduDashAppStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerOptions
  extends BaseOptions[js.Any, js.Any] {
  var interval: game | ui | normal
}

object AccelerometerOptions {
  @scala.inline
  def apply(
    interval: game | ui | normal,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): AccelerometerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AccelerometerOptions]
  }
}

