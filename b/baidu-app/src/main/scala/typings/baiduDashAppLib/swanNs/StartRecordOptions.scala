package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 超过30s或页面onHide时会结束录像 */
  var timeoutCallback: js.UndefOr[js.Function1[/* res */ RecordResponse, scala.Unit]] = js.undefined
}

object StartRecordOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null,
    timeoutCallback: js.Function1[/* res */ RecordResponse, scala.Unit] = null
  ): StartRecordOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(timeoutCallback)
    __obj.asInstanceOf[StartRecordOptions]
  }
}

