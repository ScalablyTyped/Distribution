package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): scala.Unit
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    success: js.Function1[SystemInfo, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

