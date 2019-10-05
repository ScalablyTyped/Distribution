package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_AuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettingOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ Anon_AuthSetting, Unit]] = js.undefined
}

object OpenSettingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_AuthSetting => Unit = null
  ): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenSettingOptions]
  }
}

