package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
   // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: java.lang.String): scala.Unit
}

object SaveVideoOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    success: js.Function1[java.lang.String, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): SaveVideoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[SaveVideoOptions]
  }
}

