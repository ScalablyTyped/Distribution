package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 识别银行卡并返回卡号、发卡行和卡片类型。
		 */
trait ocrBankCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图片资源地址
  @JSName("success")
  var success_ocrBankCardOptions: js.UndefOr[js.Function1[/* res */ ocrBankCardResponse, Unit]] = js.undefined
}

object ocrBankCardOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ ocrBankCardResponse => Unit = null
  ): ocrBankCardOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ocrBankCardOptions]
  }
}

