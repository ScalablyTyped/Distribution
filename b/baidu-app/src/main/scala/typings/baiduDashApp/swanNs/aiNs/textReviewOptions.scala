package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
		 * 自动化、智能化的文本审核。
		 */
trait textReviewOptions
  extends BaseOptions[js.Any, js.Any] {
  var content: String
   // 待审核文本，UTF-8，不可为空，不超过20000字节。
  @JSName("success")
  var success_textReviewOptions: js.UndefOr[js.Function1[/* res */ textReviewResponse, Unit]] = js.undefined
}

object textReviewOptions {
  @scala.inline
  def apply(
    content: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ textReviewResponse => Unit = null
  ): textReviewOptions = {
    val __obj = js.Dynamic.literal(content = content)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[textReviewOptions]
  }
}

