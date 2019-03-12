package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openShareOptions
  extends BaseOptions[js.Any, js.Any] {
   // 分享标题
  var content: js.UndefOr[java.lang.String] = js.undefined
   // 分享内容
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
   // 分享图标
  var path: js.UndefOr[java.lang.String] = js.undefined
   // 页面 path,必须是以 / 开头的完整路径。
  @JSName("success")
  var success_openShareOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_AuthSetting, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object openShareOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    content: java.lang.String = null,
    fail: js.Any => scala.Unit = null,
    imageUrl: java.lang.String = null,
    path: java.lang.String = null,
    success: /* res */ baiduDashAppLib.Anon_AuthSetting => scala.Unit = null,
    title: java.lang.String = null
  ): openShareOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (content != null) __obj.updateDynamic("content")(content)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[openShareOptions]
  }
}

