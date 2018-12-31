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

