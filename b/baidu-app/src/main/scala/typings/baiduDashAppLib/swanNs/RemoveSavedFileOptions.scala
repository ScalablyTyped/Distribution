package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: java.lang.String
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_RemoveSavedFileOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_FilePath, scala.Unit]] = js.undefined
}

object RemoveSavedFileOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ baiduDashAppLib.Anon_FilePath, scala.Unit] = null
  ): RemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RemoveSavedFileOptions]
  }
}

