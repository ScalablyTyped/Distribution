package typings.baiduApp.swan

import typings.baiduApp.AnonNortheast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetRegionOptions(res: AnonNortheast): Unit
}

object GetRegionOptions {
  @scala.inline
  def apply(
    success: AnonNortheast => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetRegionOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetRegionOptions]
  }
}

