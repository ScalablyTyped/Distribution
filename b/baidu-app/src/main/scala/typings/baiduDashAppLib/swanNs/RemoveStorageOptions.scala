package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  var key: java.lang.String
  @JSName("success")
  var success_RemoveStorageOptions: js.UndefOr[js.Function1[/* res */ DataResponse, scala.Unit]] = js.undefined
}

object RemoveStorageOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ DataResponse => scala.Unit = null
  ): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RemoveStorageOptions]
  }
}

