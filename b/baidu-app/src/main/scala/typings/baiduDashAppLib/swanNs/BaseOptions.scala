package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions[R, E] extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, scala.Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, scala.Unit]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, scala.Unit]] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply[R, E](
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* res */ E, scala.Unit] = null,
    success: js.Function1[/* res */ R, scala.Unit] = null
  ): BaseOptions[R, E] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[BaseOptions[R, E]]
  }
}

