package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----分享
trait ShareAppMessage
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 分享描述, 默认为当前小程序名称
  		 */
  var desc: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径，支持PNG及JPG
  		 * 不传入 imageUrl 则使用默认截图。显示图片长宽比是 5:4
  		 * @version 1.5.0
  		 */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 分享路径  当默认为前页面 path ，
  		 * 必须是以 / 开头的完整路径
  		 *
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  var success_ShareAppMessage: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_ShareTickets, scala.Unit]] = js.undefined
  /**
  		 * 分享标题  默认为当前小程序名称
  		 *
  		 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShareAppMessage {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    desc: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    imageUrl: java.lang.String = null,
    path: java.lang.String = null,
    success: js.Function1[/* res */ baiduDashAppLib.Anon_ShareTickets, scala.Unit] = null,
    title: java.lang.String = null
  ): ShareAppMessage = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShareAppMessage]
  }
}

