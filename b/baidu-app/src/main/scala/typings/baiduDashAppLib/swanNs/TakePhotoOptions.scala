package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_TempImagePath, scala.Unit]] = js.undefined
}

object TakePhotoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    quality: java.lang.String = null,
    success: /* res */ baiduDashAppLib.Anon_TempImagePath => scala.Unit = null
  ): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TakePhotoOptions]
  }
}

