package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.undefined
  /** 需要保存的文件的临时路径 */
  var tempFilePath: String
}

object SaveFileOptions {
  @scala.inline
  def apply(
    tempFilePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ SavedFileData => Unit = null
  ): SaveFileOptions = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SaveFileOptions]
  }
}

