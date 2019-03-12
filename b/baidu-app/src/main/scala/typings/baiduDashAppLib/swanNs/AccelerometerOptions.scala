package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerOptions
  extends BaseOptions[js.Any, js.Any] {
  var interval: baiduDashAppLib.baiduDashAppLibStrings.game | baiduDashAppLib.baiduDashAppLibStrings.ui | baiduDashAppLib.baiduDashAppLibStrings.normal
}

object AccelerometerOptions {
  @scala.inline
  def apply(
    interval: baiduDashAppLib.baiduDashAppLibStrings.game | baiduDashAppLib.baiduDashAppLibStrings.ui | baiduDashAppLib.baiduDashAppLibStrings.normal,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): AccelerometerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AccelerometerOptions]
  }
}

