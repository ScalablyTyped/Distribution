package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFullScreenOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 有效值为 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度） */
  var direction: scala.Double
}

object RequestFullScreenOptions {
  @scala.inline
  def apply(
    direction: scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): RequestFullScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RequestFullScreenOptions]
  }
}

