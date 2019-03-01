package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 自定义图像审核。
		 */
trait imageAuditOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
  var image: java.lang.String
   // 图像资源地址
  var imgUrl: js.UndefOr[java.lang.String] = js.undefined
   // 网图URL地址，以网图形式请求，图片Url需要做UrlEncode，不能与image并存。
  @JSName("success")
  var success_imageAuditOptions: js.UndefOr[js.Function1[/* res */ imageAuditResponse, scala.Unit]] = js.undefined
}

object imageAuditOptions {
  @scala.inline
  def apply(
    image: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    imgUrl: java.lang.String = null,
    success: js.Function1[/* res */ imageAuditResponse, scala.Unit] = null
  ): imageAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[imageAuditOptions]
  }
}

