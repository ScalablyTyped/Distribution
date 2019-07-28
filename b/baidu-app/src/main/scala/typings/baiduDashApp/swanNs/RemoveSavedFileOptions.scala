package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_FilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_RemoveSavedFileOptions: js.UndefOr[js.Function1[/* res */ Anon_FilePath, Unit]] = js.undefined
}

object RemoveSavedFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_FilePath => Unit = null
  ): RemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RemoveSavedFileOptions]
  }
}

