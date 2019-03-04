package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----剪贴板
trait SetClipboardDataOptions
  extends BaseOptions[js.Any, js.Any] {
  var data: java.lang.String
}

object SetClipboardDataOptions {
  @scala.inline
  def apply(
    data: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetClipboardDataOptions = {
    val __obj = js.Dynamic.literal(data = data)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetClipboardDataOptions]
  }
}

