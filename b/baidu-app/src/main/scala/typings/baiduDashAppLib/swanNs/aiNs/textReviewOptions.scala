package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
		 * 自动化、智能化的文本审核。
		 */
trait textReviewOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var content: java.lang.String
   // 待审核文本，UTF-8，不可为空，不超过20000字节。
  @JSName("success")
  var success_textReviewOptions: js.UndefOr[js.Function1[/* res */ textReviewResponse, scala.Unit]] = js.undefined
}

