package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 自定义图像审核。
		 */
trait imageAuditOptions
  extends BaseOptions[js.Any, js.Any] {
  var image: String
   // 图像资源地址
  var imgUrl: js.UndefOr[String] = js.undefined
   // 网图URL地址，以网图形式请求，图片Url需要做UrlEncode，不能与image并存。
  @JSName("success")
  var success_imageAuditOptions: js.UndefOr[js.Function1[/* res */ imageAuditResponse, Unit]] = js.undefined
}

object imageAuditOptions {
  @scala.inline
  def apply(
    image: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    imgUrl: String = null,
    success: /* res */ imageAuditResponse => Unit = null
  ): imageAuditOptions = {
    val __obj = js.Dynamic.literal(image = image)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[imageAuditOptions]
  }
}

