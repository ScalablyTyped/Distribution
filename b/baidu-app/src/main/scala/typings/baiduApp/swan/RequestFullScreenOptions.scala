package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFullScreenOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 有效值为 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度） */
  var direction: Double
}

object RequestFullScreenOptions {
  @scala.inline
  def apply(
    direction: Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): RequestFullScreenOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestFullScreenOptions]
  }
}

