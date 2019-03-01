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
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AccelerometerOptions]
  }
}

