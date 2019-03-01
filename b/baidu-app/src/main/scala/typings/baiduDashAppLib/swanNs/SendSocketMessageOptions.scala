package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSocketMessageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要发送的内容 */
  var data: java.lang.String | stdLib.ArrayBuffer
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ArrayBuffer,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
}

