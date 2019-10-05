package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, Unit]] = js.undefined
}

object GetSavedFileInfoOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ SavedFileInfoData => Unit = null
  ): GetSavedFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetSavedFileInfoOptions]
  }
}

