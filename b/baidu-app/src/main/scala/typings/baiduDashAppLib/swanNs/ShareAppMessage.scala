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

