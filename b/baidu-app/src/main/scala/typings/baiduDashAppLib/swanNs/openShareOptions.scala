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

