package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 识别银行卡并返回卡号、发卡行和卡片类型。
		 */
trait ocrBankCardOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var image: java.lang.String
   // 图片资源地址
  @JSName("success")
  var success_ocrBankCardOptions: js.UndefOr[js.Function1[/* res */ ocrBankCardResponse, scala.Unit]] = js.undefined
}

object ocrBankCardOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ ocrBankCardResponse, scala.Unit] = null
  ): ocrBankCardOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ocrBankCardOptions]
  }
}

