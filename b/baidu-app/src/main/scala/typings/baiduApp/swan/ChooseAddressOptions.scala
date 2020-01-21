package typings.baiduApp.swan

import typings.baiduApp.AnonCityName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----收货地址
trait ChooseAddressOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseAddressOptions: js.UndefOr[js.Function1[/* res */ AnonCityName, Unit]] = js.undefined
}

object ChooseAddressOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonCityName => Unit = null
  ): ChooseAddressOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseAddressOptions]
  }
}

