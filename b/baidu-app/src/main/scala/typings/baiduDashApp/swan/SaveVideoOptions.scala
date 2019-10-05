package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
   // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: String): Unit
}

object SaveVideoOptions {
  @scala.inline
  def apply(
    filePath: String,
    success: String => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): SaveVideoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[SaveVideoOptions]
  }
}

